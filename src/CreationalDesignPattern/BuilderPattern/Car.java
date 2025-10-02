package CreationalDesignPattern.BuilderPattern;

public class Car {
    private String engine;
    private int wheels;
    private int seats;
    private String color;
    private boolean sunRoof;
    private boolean navigationSytem;


    private Car(CarBuilder builder){
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.seats = builder.seats;
        this.color = builder.color;
        this.sunRoof = builder.sunRoof;
        this.navigationSytem = builder.navigationSytem;
    }

    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public String getColor() {
        return color;
    }

    public boolean isSunroof() {
        return sunRoof;
    }

    public boolean isNavigationSytem() {
        return navigationSytem;
    }


    @Override
    public String toString() {
         return "Car{" +
                "engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", seats=" + seats +
                ", color='" + color + '\'' +
                ", sunRoof=" + sunRoof +
                ", navigationSytem=" + navigationSytem +
                '}';
    }




    public static class CarBuilder{
        private String engine = "v8";
        private int wheels = 4;
        private int seats = 5;
        private String color = "black";
        private boolean sunRoof = false;
        private boolean navigationSytem = false;


        public CarBuilder setEngine(String engine){
            this.engine = engine;
            return this;
        }

        public CarBuilder setWheels(int wheels){
            this.wheels = wheels;
            return this;
        }

        public CarBuilder setSeats(int seats){
            this.seats = seats;
            return this;
        }

        public CarBuilder setColor(String color){
            this.color = color;
            return this;
        }
        public CarBuilder setSunRoof(Boolean sunRoof){
            this.sunRoof = sunRoof;
            return this;
        }

        public CarBuilder setNavigationSytem(Boolean navigationSytem){
            this.navigationSytem = navigationSytem;
            return this;
        }

        public Car build(){
           return  new Car(this);
        }

    }


}
