package BehavioralDesignPattern.CommandPattern;

public class Main {

    public static void main(String[] args){
        AirConditioner airConditioner = new AirConditioner();
        MyRemoteControl remoteObj = new MyRemoteControl();
        remoteObj.setCommand(new TurnACOnCommand(airConditioner));
        remoteObj.pressButton();

        remoteObj.setCommand(new TurnACOffCommand(airConditioner));

        remoteObj.pressButton();
    }

}
