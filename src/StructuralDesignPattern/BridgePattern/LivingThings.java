package StructuralDesignPattern.BridgePattern;

public abstract class LivingThings {
    protected BreathingProcess breathingProcess;

    public LivingThings(BreathingProcess breathingProcess) {
        this.breathingProcess = breathingProcess;
    }

    abstract public void breath();
}
