package com.example.carrental.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "brands")
public class Brand extends BaseEntity{
    private String name;
    private LocalDate origin;
    private String description;
    private String slogan;
    private int numberOfModels;
    private List<Car> cars;

    public String getName() {
        return name;
    }

    public Brand setName(String name) {
        this.name = name;
        return this;
    }

    public LocalDate getOrigin() {
        return origin;
    }

    public Brand setOrigin(LocalDate origin) {
        this.origin = origin;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Brand setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getSlogan() {
        return slogan;
    }

    public Brand setSlogan(String slogan) {
        this.slogan = slogan;
        return this;
    }

    public int getNumberOfModels() {
        return numberOfModels;
    }

    public Brand setNumberOfModels(int numberOfModels) {
        this.numberOfModels = numberOfModels;
        return this;
    }

    @OneToMany(mappedBy = "brand")
    public List<Car> getCars() {
        return cars;
    }

    public Brand setCars(List<Car> cars) {
        this.cars = cars;
        return this;
    }
}
