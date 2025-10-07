package BehavioralDesignPattern.StatePattern;

public class RedState implements TraficLightState{
    @Override
    public void next(TrafficLightContext context){
        System.out.println("Switching from red to green. Cars go!");
        context.setState(new GreenState());
    }

    @Override
    public String getColor(){
        return "RED";
    }
}
