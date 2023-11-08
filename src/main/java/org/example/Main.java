package org.example;

public class Main {
    public static void main(String[] args) {


        GasolineCar carGasoline = new GasolineCar("NF2001", "AUDI", "GangGang", 4, 20);
        System.out.println("Car: " + carGasoline.getMake());
        System.out.println(carGasoline);
        //System.out.println("RegistrationFee: " + carGasoline.getRegistrationFee());

        System.out.println(" ");

        DieselCar carDiesel = new DieselCar("GG30034", "BMW", "GangGang", 4, 19, true);
        System.out.println("Car: " + carDiesel.getMake());
        System.out.println(carDiesel);
        //System.out.println("RegistrationFee: " + carDiesel.getRegistrationFee());

        System.out.println(" ");

        ElectricCar carElectric = new ElectricCar("DK202020", "Tesla", "Model S", 4, 350000, 745);
        System.out.println("Car: " + carElectric.getMake());
        System.out.println(carElectric);
        //System.out.println("RegistrationFee: " + carElectric.getRegistrationFee());
    }
}