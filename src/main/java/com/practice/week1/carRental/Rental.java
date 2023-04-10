package com.practice.week1.carRental;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
public class Rental {

    private int rentalId;
    private Vehicle rentedVehicle;
    private Date startDate;
    private int rentalDurationInDays;
    private boolean hasGPS;
    private boolean hasChildSeat;
    private boolean hasRoofRack;
    private final int GPSRate=5;
    private final int childSeatRate=8;
    private final int roofRackRate=10;

    public double calculateRentalCost()
    {
        double basePrice = rentedVehicle.getRentalRate()* rentalDurationInDays;
        double extraCost = ((hasGPS ?1:0)*GPSRate + (hasChildSeat ?1:0)*childSeatRate + (hasRoofRack ?1:0)*roofRackRate)* rentalDurationInDays;
        return basePrice + extraCost;
    }

}
