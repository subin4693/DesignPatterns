package StructuralDesignPattern.BridgePattern;

public class Dog extends LivingThings {
    public Dog(BreathingProcess breathingProcess) {
        super(breathingProcess);
    }

    @Override
    public void breath() {
        System.out.println("Dog : ");
        breathingProcess.breath();
    }

}
