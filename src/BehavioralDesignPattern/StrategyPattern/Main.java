package BehavioralDesignPattern.StrategyPattern;

public class Main {
    public static void main(String[] args){
        PaymentProcessor paymentProcessor = new PaymentProcessor(new CreditCardPayment());
        paymentProcessor.processPayment();

        paymentProcessor.setPaymentStrategy(new CryptoPayment());
        paymentProcessor.processPayment();

    }
}
