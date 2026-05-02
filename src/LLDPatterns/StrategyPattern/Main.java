package LLDPatterns.StrategyPattern;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor(new DebitCard());

        processor.pay();
        processor.setPaymentStrategy(new CreditCard());
        processor.pay();
    }
}
