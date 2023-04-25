package vehicle;

import interfaces.IVehicle;

public class Vehicle implements IVehicle {
    private int passengers;
    private int fuelCapacity;
    private int milesPerGaloon;

    public Vehicle(int passengers, int fuelCapacity, int milesPerGaloon) {
        this.passengers = passengers;
        this.fuelCapacity = fuelCapacity;
        this.milesPerGaloon = milesPerGaloon;
    }

    public int range() {
        return milesPerGaloon * fuelCapacity;
    }

    public double fuelNeeded(int miles) {
        return (double) miles / milesPerGaloon;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getMilesPerGaloon() {
        return milesPerGaloon;
    }

    public void setMilesPerGaloon(int milesPerGaloon) {
        this.milesPerGaloon = milesPerGaloon;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Vehicle{" +
                "passengers=" + passengers +
                ", fuelCapacity=" + fuelCapacity +
                ", milesPerGaloon=" + milesPerGaloon +
                ", range=" + range() +
                '}';
    }
}