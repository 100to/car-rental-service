package com.example.carrental.mapper;

import com.example.carrental.entity.Car;
import com.example.carrental.payload.request.NewCarRequest;
import com.example.carrental.payload.response.CarResponse;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CarMapper {
    CarResponse map(Car car);

    Car map(NewCarRequest request);
}
