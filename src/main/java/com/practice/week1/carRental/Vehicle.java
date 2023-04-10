package com.practice.week1.carRental;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Vehicle {
    private String model;
    private String make;
    private int year;
    private double rentalRate;

    public abstract String getType();
}
