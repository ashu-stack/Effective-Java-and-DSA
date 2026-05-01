package LLDPatterns.FactoryPattern;

public class Car extends Vehicle{
    @Override
    void start() {
        System.out.println("Car start logic here:-  ");
    }

    @Override
    void stop() {
        System.out.println("car stop logic here:-");
    }
}
