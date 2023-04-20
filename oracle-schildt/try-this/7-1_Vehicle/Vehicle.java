class Vehicle {
    private int passengers;
    private int fuelCapacity;
    private int milesPerGaloon;

    Vehicle(int passengers, int fuelCapacity, int milesPerGaloon) {
        this.passengers = passengers;
        this.fuelCapacity = fuelCapacity;
        this.milesPerGaloon = milesPerGaloon;
    }

    int range() {
        return milesPerGaloon * fuelCapacity;
    }

    double fuelNeeded(int miles) {
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

class TruckDemo {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(2, 40 ,15);
        System.out.println(vehicle);
        System.out.println(vehicle.fuelNeeded(1000));
    }
}