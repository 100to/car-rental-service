package com.example.carrental.service;

import com.example.carrental.common.exception.NonExistingCarException;
import com.example.carrental.mapper.CarMapper;
import com.example.carrental.payload.request.NewCarRequest;
import com.example.carrental.payload.response.CarResponse;
import com.example.carrental.repository.CarRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.example.carrental.common.constant.Constant.NON_EXISTING_CAR_MESSAGE;

@Service
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;
    private final CarMapper mapper;

    public CarServiceImpl(CarRepository carRepository, CarMapper mapper) {
        this.carRepository = carRepository;
        this.mapper = mapper;
    }

    @Override
    public Page<CarResponse> getAllAvailable(Pageable pageable) {
        return this.carRepository.findAll(pageable).map(this.mapper::map);
    }

    @Override
    @Transactional
    public void rent(Long id) {
        this.carRepository.findById(id)
                .ifPresentOrElse(c -> c.setRented(true), () -> {
                    throw new NonExistingCarException(NON_EXISTING_CAR_MESSAGE);
                });
    }

    @Override
    public void leave(Long id) {
        this.carRepository.findById(id)
                .ifPresentOrElse(c -> c.setRented(false), () -> {
                    throw new NonExistingCarException(NON_EXISTING_CAR_MESSAGE);
                });
    }

    @Override
    public void addNew(NewCarRequest request) {
        this.carRepository.save(this.mapper.map(request));
    }
}
