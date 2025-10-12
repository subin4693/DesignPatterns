package StructuralDesignPattern.DecoratorPattern;

public class FarmHouse implements BasePizza {

    @Override
    public String getDecription() {
        return "Farmhouse pizza";
    }

    @Override

    public double getCost() {
        return 300.20;
    }

}