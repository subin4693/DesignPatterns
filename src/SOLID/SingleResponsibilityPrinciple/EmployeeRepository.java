package SOLID.SingleResponsibilityPrinciple;

public class EmployeeRepository {
    public void save(Employee employee) {
        System.out.println("Saving " + employee.getName() + "to database...");
    }
}
