package CreationalDesignPattern.AbstractFactoryPattern;

public class Main {
    public static void main(String[] args){
        VehicleFactory bmw = new BmwFactory();
        Vehicle carBmw = bmw.createVehicle();
        carBmw.start();
        carBmw.stop();
    }
}
