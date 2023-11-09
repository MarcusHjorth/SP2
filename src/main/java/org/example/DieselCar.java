package org.example;

public class DieselCar extends AFuelCar{
    boolean hasParticleFilter;

    public DieselCar(String getRegistrationNumber, String getMake, String getModel, int getNumberOfDoors, int kmPrLitre, boolean hasParticleFilter) {
        super(getRegistrationNumber, getMake, getModel, getNumberOfDoors, kmPrLitre);
        this.hasParticleFilter = hasParticleFilter;
    }

    public String getFuelType(){
        return "Diesel";
    }

    public int getRegistrationFee(){
        int totalFee = 0;

        if (kmPrLitre() >= 20 && kmPrLitre() < 50) {
            totalFee = 330 + 130;
        } else if (kmPrLitre >= 15 && kmPrLitre < 20) {
            totalFee = 1050 + 1390;
        } else if (kmPrLitre >= 10 && kmPrLitre < 15) {
            totalFee = 2340 + 1850;
        } else if (kmPrLitre >= 5 && kmPrLitre < 10) {
            totalFee = 5500 + 2770;
        } else if (kmPrLitre < 5) {
            totalFee = 10470 + 15260;
        }
        if (!hasParticleFilter()) {
            return totalFee + 1000;
        }
        else return totalFee;
    }

    public boolean hasParticleFilter(){
        return hasParticleFilter;
    }

    @Override
    public String toString() {
        return super.toString() + " | FuelType: " + getFuelType() + " | RegistrationFee: " + getRegistrationFee();
    }
}
