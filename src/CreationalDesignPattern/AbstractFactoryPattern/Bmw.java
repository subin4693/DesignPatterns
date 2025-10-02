package CreationalDesignPattern.AbstractFactoryPattern;

public class Bmw implements Vehicle{
    @Override
    public void start() {
        System.out.println("Bmw is starting...");
    }
    @Override
    public void stop(){
        System.out.println("Bmw is stoping...");
    }
}
