package CreationalDesignPattern.AbstractFactoryPattern;

public class BmwFactory implements VehicleFactory{
    public Vehicle createVehicle(){
        return new Bmw();
    }
}
