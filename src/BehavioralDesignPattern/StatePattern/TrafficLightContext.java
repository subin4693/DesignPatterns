package BehavioralDesignPattern.StatePattern;

public class TrafficLightContext {
    private TraficLightState currentState;

    public TrafficLightContext(){
        currentState = new RedState();
    }

    public void setState(TraficLightState state)
    {
        this.currentState = state;
    }

    public void next()
    {
        currentState.next(this);
    }

    public String getColor()
    {
        return currentState.getColor();
    }
}
