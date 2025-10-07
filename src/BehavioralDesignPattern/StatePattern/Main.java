package BehavioralDesignPattern.StatePattern;

public class Main {
    public static void main(String[] args){
        TrafficLightContext context = new TrafficLightContext();
        System.out.println(context.getColor());
        context.next();
        System.out.println(context.getColor());
        context.next();
        System.out.println(context.getColor());
        context.next();

    }
}
