package BehavioralDesignPattern.StrategyPattern;

public class CryptoPayment implements PaymentStrategy{
    public void processPayment(){
        System.out.println("Processing crypto payment processing");
    }
}
