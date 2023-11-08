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

        if (hasParticleFilter) {
            if (kmPrLitre() >= 20 && kmPrLitre() <= 50) {
                return 330 + 130;
            } else if (kmPrLitre >= 15 && kmPrLitre < 20) {
                return 1050 + 1390;
            } else if (kmPrLitre >= 10 && kmPrLitre < 15) {
                return 2340 + 1850;
            } else if (kmPrLitre >= 5 && kmPrLitre < 10) {
                return 5500 + 2770;
            } else if (kmPrLitre < 5) {
                return 10470 + 15260;
            }
            else return 0;
        }
        else return 0;
    }

    public boolean hasParticleFilter(){
        return hasParticleFilter;
    }


}
