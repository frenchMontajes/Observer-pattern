

public interface NewsManager {
    public void subscribe(newsSubscribers subscriber);
    public void unsubscribe(newsSubscribers subscriber);
    public void notifyNewsSubscribers();
}
