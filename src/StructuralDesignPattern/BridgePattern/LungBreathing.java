package StructuralDesignPattern.BridgePattern;

public class LungBreathing implements BreathingProcess {
    @Override
    public void breath() {
        System.out.println("Breathing through lungs");
    }

}
