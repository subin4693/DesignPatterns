package BehavioralDesignPattern.StatePattern;

public class GreenState implements TraficLightState{
    @Override
    public void next(TrafficLightContext context){
        System.out.println("Switching from green to yellow. Slow down!");
        context.setState(new YellowState());
    }

    @Override
    public String getColor(){
        return "GREEN";
    }
}
