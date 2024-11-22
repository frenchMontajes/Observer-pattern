

public class newsSubscribers implements Subscriber {
    private final String name;

    public newsSubscribers(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " Received breaking news: " + news);
    }

    public String getName() {
        return name;
    }
}
