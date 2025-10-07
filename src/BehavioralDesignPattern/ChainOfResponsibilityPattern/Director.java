package BehavioralDesignPattern.ChainOfResponsibilityPattern;

public class Director extends Approver {
    public void processLeaveRequest(int leavDays) {
        if (leavDays <= 7) {
            System.out.println("manager approved the leave");
        } else if (nextApprover != null) {
            nextApprover.processLeaveRequest(leavDays);
        } else {
            System.out.println("Leave request denied. Too many leave");
        }
    }
}
