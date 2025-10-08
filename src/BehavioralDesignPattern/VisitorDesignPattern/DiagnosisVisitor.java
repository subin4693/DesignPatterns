package BehavioralDesignPattern.VisitorDesignPattern;

public class DiagnosisVisitor implements Visitor {
    public void visit(ChildPatient childPatient) {
        System.out.println("Diagnosising a child patient : check-up and pediatric care.");
    }

    public void visit(AdultPatient adultPatient) {
        System.out.println("Diagonosising an adult patient : Routine exams and lifecycle advice");
    }

    public void visit(SeniorPatient seniorPatient) {
        System.out.println("Diagnosing a senior patient: comprehensive generic evalution");
    }

}
