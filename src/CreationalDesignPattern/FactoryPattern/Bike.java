package CreationalDesignPattern.FactoryPattern;

public class Bike implements Vehicle{
    public void start(){
        System.out.println("Bike is starting");
    }

    public void stop(){
        System.out.println("Bike is stoping");
    }
}
