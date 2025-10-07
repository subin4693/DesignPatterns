package BehavioralDesignPattern.StatePattern;

public interface TraficLightState {
    void next(TrafficLightContext context);
    String getColor();
}
