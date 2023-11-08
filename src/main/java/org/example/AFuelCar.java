package org.example;

public abstract class AFuelCar extends ACar{
    protected int kmPrLitre;

    public AFuelCar(String getRegistrationNumber, String getMake, String getModel, int getNumberOfDoors, int kmPrLitre) {
        super(getRegistrationNumber, getMake, getModel, getNumberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    public abstract String getFuelType();

    int kmPrLitre(){
        return 0;
    }

    @Override
    public String toString() {
        return "AFuelCar{" + "kmPrLitre=" + kmPrLitre + '}';
    }
}
