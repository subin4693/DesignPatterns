package CreationalDesignPattern.FactoryPattern;

public class Car implements Vehicle{
    @Override
    public void start(){
        System.out.println("Cart is starting...");

    }
    @Override
    public void stop(){
    System.out.println("Car is stoping...");
    }
}