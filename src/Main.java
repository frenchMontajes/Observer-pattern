

public class Main {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        newsSubscribers mike = new newsSubscribers("Mike");
        newsSubscribers john = new newsSubscribers("John");
        newsSubscribers jane = new newsSubscribers("Jane");

        newsAgency.subscribe(mike);
        newsAgency.subscribe(john);
        newsAgency.subscribe(jane);

        newsAgency.publishNews("Artificial Intelligence achieves a new breakthrough!");


        newsAgency.unsubscribe(john);

        newsSubscribers james = new newsSubscribers("James");
        newsAgency.subscribe(james);

        newsAgency.publishNews("Astronomers discover a new Earth-like exoplanet!");



    }
}
