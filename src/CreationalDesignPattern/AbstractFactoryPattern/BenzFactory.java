package CreationalDesignPattern.AbstractFactoryPattern;

public class BenzFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle( ) {
        return new Benz();
    }
}
