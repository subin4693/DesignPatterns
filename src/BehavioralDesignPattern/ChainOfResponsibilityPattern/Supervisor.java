package BehavioralDesignPattern.ChainOfResponsibilityPattern;

public class Supervisor extends Approver {
    public void processLeaveRequest(int leavDays) {
        if (leavDays <= 3) {
            System.out.println("Supervisor approved the leave");
        } else if (nextApprover != null) {
            nextApprover.processLeaveRequest(leavDays);
        }
    }

}
