package CreationalDesignPattern.FactoryPattern;

public class VehicleFactory {
    public static Vehicle getVehicle(String vehicleType){
        switch(vehicleType){
            case "car":
                return new Car();
            case "bike":
                return new Bike();
            case "truck":
                return new Truck();
            default:
                 return null;
        }

    }
}
