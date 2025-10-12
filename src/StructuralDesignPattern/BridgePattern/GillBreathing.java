package StructuralDesignPattern.BridgePattern;

public class GillBreathing implements BreathingProcess {
    @Override
    public void breath() {
        System.out.println("Breathing through gills");
    }

}
