import java.util.Date;
import java.util.Calendar;

public class Movie {
    private String name;
    private Actors[][] actors;
    private int releaseDate;
    private int durationInMinutes;
    private int totalReviews;
    private double reviews;
    private double aggregateRatings;

    public Movie(String name, Actors[][] actors, int releaseDate, int durationInMinutes, int totalReviews, double reviews) {
        this.name = name;
        this.actors = actors;
        this.releaseDate = releaseDate;
        this.durationInMinutes = durationInMinutes;
        this.totalReviews = totalReviews;
        this.reviews = reviews;
    }

    public String getName() {
        return name;
    }

    public Actors[][] getActors() {
        return actors;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public int getTotalReviews() {
        return totalReviews;
    }

    public double getReviews() {
        return reviews;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setActors(Actors[][] actors) {
        this.actors = actors;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void setTotalReviews(int totalReviews) {
        this.totalReviews = totalReviews;
    }

    public void setReviews(double reviews) {
        this.reviews = reviews;
    }


    // getting the movie's review
    public void review(double rating) {
        aggregateRatings += rating;
        totalReviews ++;
    }

    // average of the movie's reviews
    public double average() {
        return this.aggregateRatings / this.totalReviews;
    }

    // it'll print on the console all of the actors who work in the movie
    public void showActors() {
        // initializing objects
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        Help split = new Help();

        // setting current date
        calendar.setTime(date);

        // assigning date in the variables
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.DAY_OF_YEAR);
        int year = calendar.get(Calendar.YEAR);

        // printing all of actors
        System.out.println(split.split(30));
        for (int i = 0; i < this.actors.length; i++) {
            System.out.println("Name: " + this.actors[i][0].getName());
            System.out.println("Age : " + this.actors[i][0].age(year, month, day));
            System.out.println("Movie's role: " + this.actors[i][1]);
            System.out.println(new Help().split(30));
        }
    }

    public void showStatus() {
        Help help = new Help();
        StringBuilder line = help.split(30);

        System.out.println(line);
        System.out.println("Name" + this.name);
        System.out.println("Realese date: " + this.releaseDate);
        System.out.println("Duration: " + this.durationInMinutes + "min");
        System.out.println("Rating: " + );
    }
}