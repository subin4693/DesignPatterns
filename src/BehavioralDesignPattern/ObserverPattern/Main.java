package BehavioralDesignPattern.ObserverPattern;

public class Main {
    public static void main(String[] args){
        YoutubeChannelImpl youtubeChannel = new YoutubeChannelImpl();

        EmailSubscriber emailSubscriber = new EmailSubscriber("46subin@gmail.com");

        MobileSubscriber mobileSubscriber = new MobileSubscriber("+91 84758338");

        youtubeChannel.addSubscriber(emailSubscriber);
        youtubeChannel.addSubscriber(mobileSubscriber);

        youtubeChannel.updateNewVideo("java bootcamp");
        youtubeChannel.removeSubscriber(mobileSubscriber);
        youtubeChannel.updateNewVideo("lld bootcamp");

    }
}
