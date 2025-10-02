package CreationalDesignPattern.BuilderPattern;

public class Main {
    public static void main(String[] args){
        Car.CarBuilder builder = new Car.CarBuilder();
        Car car1 = builder.setColor("Orange").build();
        System.out.println(car1);

    }
}
