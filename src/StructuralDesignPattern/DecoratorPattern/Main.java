package StructuralDesignPattern.DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza1 = new PlainPizza();
        System.out.println("Order 1 : " + pizza1.getDecription());
        BasePizza pizza2 = new CheeseTopping(new PlainPizza());
        pizza2.getDecription();
        System.out.println("Order 2 : " + pizza2.getDecription());
    }
}
