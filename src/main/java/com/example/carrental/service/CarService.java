package com.example.carrental.service;

import com.example.carrental.payload.request.NewCarRequest;
import com.example.carrental.payload.response.CarResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CarService {
    Page<CarResponse> getAllAvailable(Pageable pageable);

    void rent(Long id);

    void leave(Long id);

    void addNew(NewCarRequest request);
}
