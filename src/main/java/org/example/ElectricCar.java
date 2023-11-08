package org.example;

public class ElectricCar extends ACar {

    int batteryCapacity;
    int maxRange;
    public ElectricCar(String getRegistrationNumber, String getMake, String getModel, int getNumberOfDoors, int batteryCapacity, int maxRange){
        super(getRegistrationNumber, getMake, getModel, getNumberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }


    public int getBatteryCapacityKWh(){
        return batteryCapacity;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public int getWhPrKm(){
        return batteryCapacity / maxRange;
    }


    public int getRegistrationFee(){
        float WhKm = 100 / (getWhPrKm() /(float)91.25);
        if (WhKm >= 20 ){
            return 330;
        } else if (WhKm >= 15 && WhKm < 20){
            return 1050;
        } else if (WhKm >= 10 && WhKm < 15){
            return 2340;
        } else if (WhKm >= 5 && WhKm < 10){
            return 5500;
        } else if (WhKm < 5){
            return 10470;
        }
        else return 0;
    }

    @Override
    public String toString() {
        return super.toString() + " Wh/Pr/Km: " + getWhPrKm() + " BatteryCapacity: " + batteryCapacity + " maxRange: " + maxRange + " RegistrationFee: " + getRegistrationFee();
    }
}
