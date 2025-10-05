package BehavioralDesignPattern.CommandPattern;

public class AirConditioner {
    boolean isOn;
    int temprature;

    public void turnOnAc(){
        isOn = true;
        System.out.println("AC is ON");
    }

    public void turnOffAc(){
        isOn = false;
        System.out.println("Ac is OFF");
    }

    public void setTemprature(int temprature){
        this.temprature = temprature;
        System.out.println("Temparature changed to : "+temprature);
    }

}
