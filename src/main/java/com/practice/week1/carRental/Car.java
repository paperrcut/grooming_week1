package com.practice.week1.carRental;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Car extends Vehicle{
    private int numDoors;
    private String fuelType;

    @Override
    public String getType()
    {
        return "CAR";
    }
}
