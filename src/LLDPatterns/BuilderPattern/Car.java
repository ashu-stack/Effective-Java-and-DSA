package LLDPatterns.BuilderPattern;

public class Car {
    String engine;
    int wheels;
    String color;
    int seats;
    String musicSystem;
    boolean sunroof;
    boolean reverseCam;

    private Car(CarBuilder builder){
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.color = builder.color;
        this.seats = builder.seats;
        this.musicSystem = builder.musicSystem;
        this.sunroof = builder.sunroof;
        this.reverseCam = builder.reverseCam;
    }

    public static class CarBuilder{
        String engine = "V8";
        int wheels = 4;
        int gears = 6;
        String color = "Black";
        int seats = 2;
        String musicSystem = "Harman";
        boolean sunroof = false;
        boolean reverseCam = true;


        public CarBuilder engine(String engine){
            this.engine = engine;
            return this;
        }

        public CarBuilder wheels(int wheels){
            this.wheels = wheels;
            return this;
        }

        public CarBuilder gears(int gears){
            this.gears = gears;
            return this;
        }

        public CarBuilder color(String color){
            this.color = color;
            return this;
        }

        public CarBuilder seats(int seats){
            this.seats = seats;
            return this;
        }

        public CarBuilder music(String musicSystem){
            this.musicSystem = musicSystem;
            return this;
        }

        public CarBuilder sunroof(boolean sunroof){
            this.sunroof = sunroof;
            return this;
        }


        public CarBuilder reverse(boolean reverseCam){
            this.reverseCam = reverseCam;
            return this;
        }

        public Car build(){
            return new Car(this);
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", color='" + color + '\'' +
                ", seats=" + seats +
                ", musicSystem='" + musicSystem + '\'' +
                ", sunroof=" + sunroof +
                ", reverseCam=" + reverseCam +
                '}';
    }
}
