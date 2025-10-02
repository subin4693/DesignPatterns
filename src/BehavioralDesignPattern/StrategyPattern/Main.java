package BehavioralDesignPattern.StrategyPattern;

public class Main {
    public static void main(String[] args){
        PaymentProcessor paymentProcessor = new PaymentProcessor(new CreditCardPayment());
        paymentProcessor.processPayment();
        PaymentProcessor paymentProcessorUsingCrypto = new PaymentProcessor(new CryptoPayment());
        paymentProcessorUsingCrypto.processPayment();
    }
}
