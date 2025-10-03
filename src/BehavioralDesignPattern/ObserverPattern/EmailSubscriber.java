package BehavioralDesignPattern.ObserverPattern;

public class EmailSubscriber implements Subscriber{
    String email;

     EmailSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void update(String video){
        System.out.println("Sending mail to "+email+" new video updated "+video);
    }
}
