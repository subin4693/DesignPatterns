package BehavioralDesignPattern.VisitorDesignPattern;

public interface Patient {
    void accept(Visitor visitor);
}
