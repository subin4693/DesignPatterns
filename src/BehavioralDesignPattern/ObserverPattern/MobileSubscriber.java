package BehavioralDesignPattern.ObserverPattern;

public class MobileSubscriber implements Subscriber{

    String mobileNumber;

    MobileSubscriber(String mobileNumber){
        this.mobileNumber = mobileNumber;
    }


    @Override
    public void update(String video){
        System.out.println("Sms send to "+mobileNumber+ " new video uploaded : " + video);
    }
}
