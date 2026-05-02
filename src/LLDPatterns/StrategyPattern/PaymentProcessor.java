package LLDPatterns.StrategyPattern;

public class PaymentProcessor {
    private PaymentStrategy paymentStrategy ;

    public PaymentProcessor(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(){
        this.paymentStrategy.makePayment();
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
