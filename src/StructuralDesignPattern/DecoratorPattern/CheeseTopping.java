package StructuralDesignPattern.DecoratorPattern;

public class CheeseTopping extends ToppingDecorator {

    public CheeseTopping(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public String getDecription() {
        return pizza.getDecription() + "Extra cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 20;
    }

}
