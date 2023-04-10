package com.practice.week1.carRental;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class SUV extends Vehicle{
    private int numSeats;
    private boolean fourWheelDrive;

    @Override
    public String getType()
    {
        return "SUV";
    }
}
