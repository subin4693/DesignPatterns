package BehavioralDesignPattern.TemplatePattern;

public class TeaBeverage extends Beverage {
    @Override
    void brew() {
        System.out.println("Brewing tea...");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon...");
    }

}
