package org.example;

import java.util.ArrayList;
import java.text.NumberFormat;

public class FleetOfCars{
    private final ArrayList<Car> fleet = new ArrayList<>();

    public void addCar(Car car){
        fleet.add(car);
    }

    public int getTotalRegistrationFeeForFleet(){
        int totalRegistrationFee = 0;
        for (Car car : fleet){
            totalRegistrationFee += car.getRegistrationFee();
        }
        return totalRegistrationFee;
    }

    @Override
    public String toString() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        String carsInList = "";
        for (Car car : fleet)
            carsInList += car + "\n";
        return carsInList + "\nTotal cars: " + fleet.size() + "\nTotal fleet registration fee " + formatter.format(getTotalRegistrationFeeForFleet());
    }
}
