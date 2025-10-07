package BehavioralDesignPattern.ChainOfResponsibilityPattern;

public class Main {

    public static void main(String[] args) {
        Approver supervisor = new Supervisor();
        Approver manager = new Manager();
        Approver director = new Director();

        supervisor.setNextApprover(manager);
        manager.setNextApprover(director);

        int leavDays = 7;
        System.out.println("Employee requests " + leavDays + " days of leave");
        supervisor.processLeaveRequest(leavDays);
    }

}
