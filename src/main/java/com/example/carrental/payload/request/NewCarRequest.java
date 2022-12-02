package com.example.carrental.payload.request;

import com.example.carrental.entity.Brand;
import com.example.carrental.entity.Engine;
import com.example.carrental.entity.Gear;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Positive;
import org.springframework.lang.Nullable;

import java.time.LocalDate;

public class NewCarRequest {
    private Brand brand;
    private int kilometers;
    private Gear gear;
    private Engine engine;
    private double horsePower;
    private double maxSpeed;
    private double gasConsumptionPer100Kilometers;
    private LocalDate registeredOn;
    private LocalDate producedOn;

    @NotNull
    public Brand getBrand() {
        return brand;
    }

    public NewCarRequest setBrand(Brand brand) {
        this.brand = brand;
        return this;
    }

    @Positive
    public int getKilometers() {
        return kilometers;
    }

    public NewCarRequest setKilometers(int kilometers) {
        this.kilometers = kilometers;
        return this;
    }

    @NotNull
    public Gear getGear() {
        return gear;
    }

    public NewCarRequest setGear(Gear gear) {
        this.gear = gear;
        return this;
    }

    @NotNull
    public Engine getEngine() {
        return engine;
    }

    public NewCarRequest setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Positive
    public double getHorsePower() {
        return horsePower;
    }

    public NewCarRequest setHorsePower(double horsePower) {
        this.horsePower = horsePower;
        return this;
    }

    @Positive
    public double getMaxSpeed() {
        return maxSpeed;
    }

    public NewCarRequest setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    @Positive
    public double getGasConsumptionPer100Kilometers() {
        return gasConsumptionPer100Kilometers;
    }

    public NewCarRequest setGasConsumptionPer100Kilometers(double gasConsumptionPer100Kilometers) {
        this.gasConsumptionPer100Kilometers = gasConsumptionPer100Kilometers;
        return this;
    }

    public LocalDate getRegisteredOn() {
        return registeredOn;
    }

    public NewCarRequest setRegisteredOn(LocalDate registeredOn) {
        this.registeredOn = registeredOn;
        return this;
    }

    public LocalDate getProducedOn() {
        return producedOn;
    }

    public NewCarRequest setProducedOn(LocalDate producedOn) {
        this.producedOn = producedOn;
        return this;
    }
}
