package com.example.carrental.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "cars")
public class Car extends BaseEntity {
    private Brand brand;
    private int kilometers;
    private Gear gear;
    private Engine engine;
    private double horsePower;
    private double maxSpeed;
    private double gasConsumptionPer100Kilometers;
    private LocalDate registeredOn;
    private LocalDate producedOn;
    private boolean isRented;

    @ManyToOne
    public Brand getBrand() {
        return brand;
    }

    public Car setBrand(Brand brand) {
        this.brand = brand;
        return this;
    }

    public int getKilometers() {
        return kilometers;
    }

    public Car setKilometers(int kilometers) {
        this.kilometers = kilometers;
        return this;
    }

    @Enumerated(EnumType.STRING)
    public Gear getGear() {
        return gear;
    }

    public Car setGear(Gear gear) {
        this.gear = gear;
        return this;
    }

    @Enumerated(EnumType.STRING)
    public Engine getEngine() {
        return engine;
    }

    public Car setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public Car setHorsePower(double horsePower) {
        this.horsePower = horsePower;
        return this;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public Car setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    public double getGasConsumptionPer100Kilometers() {
        return gasConsumptionPer100Kilometers;
    }

    public Car setGasConsumptionPer100Kilometers(double gasConsumptionPer100Kilometers) {
        this.gasConsumptionPer100Kilometers = gasConsumptionPer100Kilometers;
        return this;
    }

    public LocalDate getRegisteredOn() {
        return registeredOn;
    }

    public Car setRegisteredOn(LocalDate registeredOn) {
        this.registeredOn = registeredOn;
        return this;
    }

    public LocalDate getProducedOn() {
        return producedOn;
    }

    public Car setProducedOn(LocalDate producedOn) {
        this.producedOn = producedOn;
        return this;
    }

    public boolean isRented() {
        return isRented;
    }

    public Car setRented(boolean rented) {
        isRented = rented;
        return this;
    }
}
