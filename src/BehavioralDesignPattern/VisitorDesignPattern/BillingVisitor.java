package BehavioralDesignPattern.VisitorDesignPattern;

public class BillingVisitor implements Visitor {

    public void visit(ChildPatient childPatient) {
        System.out.println("Calculating  billing for a child patient");
    }

    public void visit(AdultPatient adultPatient) {
        System.out.println("Calculating  billing for a child adult");
    }

    public void visit(SeniorPatient seniorPatient) {
        System.out.println("Calculating  billing for a senior patient");
    }

}
