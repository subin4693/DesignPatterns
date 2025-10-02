package CreationalDesignPattern.AbstractFactoryPattern;



public class Benz implements Vehicle {
    @Override
    public void start() {
        System.out.println("Benz is starting...");
    }
    @Override
    public void stop(){
        System.out.println("Benz is stoping...");
    }
}
