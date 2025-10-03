package BehavioralDesignPattern.ObserverPattern;

public interface YoutubeChannel {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscriber();
}
