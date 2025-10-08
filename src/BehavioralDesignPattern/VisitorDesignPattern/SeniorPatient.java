package BehavioralDesignPattern.VisitorDesignPattern;

public class SeniorPatient implements Patient {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
