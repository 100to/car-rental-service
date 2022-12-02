package com.example.carrental.controller;

import com.example.carrental.payload.request.NewCarRequest;
import com.example.carrental.payload.response.CarResponse;
import com.example.carrental.service.CarService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rental")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/available")
    public Page<CarResponse> getAllAvailable(Pageable pageable) {
        return this.carService.getAllAvailable(pageable);
    }

    @PutMapping("/rent/{id}")
    public void rent(@PathVariable Long id) {
        this.carService.rent(id);
    }

    @PutMapping("/rent-hault/{id}")
    public void leave(@PathVariable Long id) {
        this.carService.leave(id);
    }

    @PostMapping("/addition-of-a-new")
    public void addNew(@RequestBody @Valid NewCarRequest request) {
        this.carService.addNew(request);
    }
}
