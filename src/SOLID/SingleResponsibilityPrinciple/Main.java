package SOLID.SingleResponsibilityPrinciple;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Subin", 50000);
        EmployeeRepository repository = new EmployeeRepository();
        repository.save(emp);
    }
}
