package SOLID.OpenClosePrinciple;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int ans = calculator.calculateNumber(2, 2, new AddOperation());
        int ans2 = calculator.calculateNumber(6, 2, new SubstractOperation());

        System.out.println(ans2);
    }
}
