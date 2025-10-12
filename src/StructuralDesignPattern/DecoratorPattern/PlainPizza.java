package StructuralDesignPattern.DecoratorPattern;

public class PlainPizza implements BasePizza {

    @Override
    public String getDecription() {
        return "Plain pizza";
    }

    @Override

    public double getCost() {
        return 200.20;
    }

}
