package StructuralDesignPattern.BridgePattern;

public class Main {
    public static void main(String[] args) {
        LivingThings dog = new Dog(new GillBreathing());
        dog.breath();
    }
}
