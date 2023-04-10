package com.practice.week1.carRental;

import lombok.AllArgsConstructor;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
public class RentalSystem {
    private List<Rental> rentals;

    public Rental rentVehicle(int rentalId, Vehicle vehicle, Date startDate, int duration, boolean hasGPS, boolean hasChildSeat, boolean hasRoofRack)
    {
        Rental newRental = new Rental(rentalId,vehicle, startDate, duration, hasGPS, hasChildSeat, hasRoofRack);
        rentals.add(newRental);
        return newRental;
    }

    public void returnVehicle(Rental rental)
    {
        rentals.remove(rental);
    }

    public String generateReport(){
        String report="Rented Vehicles:\n" ;
        double totalRevenue=0.0;
        for(Rental rental:rentals)
        {
            double totalCost = rental.calculateRentalCost();
            report+=rental.getRentedVehicle().getMake()+" "+rental.getRentedVehicle().getModel()+" "+rental.getRentedVehicle().getType()+" Rental Cost: "+totalCost+"\n";
            totalRevenue+=totalCost;
        }
        report+="Total Revenue: "+totalRevenue+"\n";
        System.out.println(report);
        return report;
    }
}
