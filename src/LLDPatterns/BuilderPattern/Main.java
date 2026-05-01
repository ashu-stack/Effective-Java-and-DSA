package LLDPatterns.BuilderPattern;

public class Main {
    public static void main(String[] args) {
        Car.CarBuilder builder = new Car.CarBuilder();

        Car myCar = builder.engine("V12").color("black").gears(8).sunroof(true).build();
        System.out.println(myCar);
    }
}
