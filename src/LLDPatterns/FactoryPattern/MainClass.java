package LLDPatterns.FactoryPattern;

public class MainClass {
    public static void main(String[] args) {
       VehicleFactory vehicleFactory = new VehicleFactory();

       Vehicle car = vehicleFactory.getVehicle("Car");
       car.stop();
       car.start();
    }
}
