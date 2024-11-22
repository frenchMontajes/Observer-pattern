
import java.util.ArrayList;
import java.util.List;


public class NewsAgency implements NewsManager {
    private final List<Subscriber> subscribers;
    private String news;

    public NewsAgency() {
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void subscribe(newsSubscribers subscriber) {
        subscribers.add(subscriber);
        System.out.println(subscriber.getName() + " subscribed!");
    }

    @Override
    public void unsubscribe(newsSubscribers subscriber) {
        subscribers.remove(subscriber);
        System.out.println(subscriber.getName() + " unsubscribed!");

    }

    @Override
    public void notifyNewsSubscribers() {
            for (Subscriber subscriber : subscribers) {
                subscriber.update(news);
            }
    }

    public void publishNews(String newNews) {
        this.news = newNews;
        System.out.println("\nBreaking News Published: " + newNews);
        System.out.println();
        notifyNewsSubscribers();
        System.out.println();
    }
}
