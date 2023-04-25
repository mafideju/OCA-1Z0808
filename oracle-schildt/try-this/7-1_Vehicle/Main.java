import vehicle.Vehicle;
import truck.Truck;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(2, 40 ,15);
        Truck truck = new Truck(1, 100, 10, 1500);
        java.text.DecimalFormat formatter = new java.text.DecimalFormat("#.##", new java.text.DecimalFormatSymbols(java.util.Locale.US));

        formatter.setRoundingMode(java.math.RoundingMode.DOWN);
        double formatterValue = Double.parseDouble(formatter.format(vehicle.fuelNeeded(1000)));
        double formatterTruckValue = Double.parseDouble(formatter.format(truck.fuelNeeded(1000)));

        System.out.println(vehicle);
        System.out.println(truck);
        System.out.println("Fuel Req. for vehicle (1000 miles): " + formatterValue + " gals.");
        System.out.println("Fuel Req. for truck (1000 miles): " + formatterTruckValue + " gals.");
    }
}
