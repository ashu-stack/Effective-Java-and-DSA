package LLDPatterns.StrategyPattern;

public class CreditCard implements PaymentStrategy{
    @Override
    public void makePayment() {
        System.out.println("Make payment via credit card..");
    }
}
