package truck;
import vehicle.Vehicle;

public class Truck extends Vehicle {
    private int cargoCapacity;

    public Truck(int passengers, int fuelCapacity, int milesPerGalloon, int cargoCapacity) {
        super(passengers, fuelCapacity, milesPerGalloon);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return this.cargoCapacity;
    }

    public void putCargoCapacity(int cargoReceived){
        this.cargoCapacity = cargoReceived;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Truck{" +
                "passengers=" + getPassengers() +
                ", fuelCapacity=" + getFuelCapacity() +
                ", milesPerGaloon=" + getMilesPerGaloon() +
                ", cargoCapacity=" + cargoCapacity +
                ", range=" + range() +
                '}';

    }
}