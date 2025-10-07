package BehavioralDesignPattern.StatePattern;

public class YellowState  implements TraficLightState{
    @Override
    public void next(TrafficLightContext context){
        System.out.println("Switching from Yellow to red. stop!");
        context.setState(new RedState());
    }

    @Override
    public String getColor(){
        return "YELLOW";
    }
}
