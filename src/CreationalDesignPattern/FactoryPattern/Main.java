package CreationalDesignPattern.FactoryPattern;

public class Main {
    public static void  main(String[] args){
        Vehicle car = VehicleFactory.getVehicle("car");
        car.start();
        car.stop();
    }
}


//bad code

//public class Main {
//    public static void  main(String[] args){
//        Vehicle car = new Car();
//        car.start();
//        car.stop();
//    }
//}