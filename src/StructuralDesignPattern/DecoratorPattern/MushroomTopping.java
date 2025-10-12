package StructuralDesignPattern.DecoratorPattern;

public class MushroomTopping extends ToppingDecorator {

    public MushroomTopping(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public String getDecription() {
        return pizza.getDecription() + "Mushroom";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 40;
    }

}
