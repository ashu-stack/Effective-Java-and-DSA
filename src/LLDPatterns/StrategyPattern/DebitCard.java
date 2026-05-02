package LLDPatterns.StrategyPattern;

public class DebitCard implements PaymentStrategy{
    @Override
    public void makePayment() {
        System.out.println("Make payment via debit card");
    }
}
