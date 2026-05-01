package LLDPatterns.FactoryPattern;

public class Bike extends Vehicle{

    @Override
    void start() {
        System.out.println("Bike start method");
    }

    @Override
    void stop() {
        System.out.println("Bike stop method");
    }
}
