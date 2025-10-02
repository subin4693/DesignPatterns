package CreationalDesignPattern.FactoryPattern;

public class Truck implements Vehicle{

    public void start(){
        System.out.println("Truck is starting");
    }
    public void stop(){
        System.out.println("Truck is stoping");
    }
}
