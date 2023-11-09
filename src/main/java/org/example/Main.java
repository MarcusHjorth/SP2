package org.example;

public class Main {
    public static void main(String[] args) {

        GasolineCar carGasoline = new GasolineCar("NF2001", "AUDI", "GangGang", 4, 20);
        DieselCar carDiesel = new DieselCar("GG30034", "BMW", "GangGang", 4, 19, true);
        ElectricCar carElectric = new ElectricCar("DK202020", "Tesla", "Model S", 4, 350000, 745);

        FleetOfCars fleetOfCars = new FleetOfCars();

        fleetOfCars.addCar(carGasoline);
        fleetOfCars.addCar(carDiesel);
        fleetOfCars.addCar(carElectric);

        System.out.println(fleetOfCars);

    }
}