package com.java_project.movie;

import com.java_project.support.Help;

public class Media {
    private String name;
    private int releaseDate;
    private int durationInMinutes;
    private int totalReviews; // number of people who rated the media
    private double reviews; // media's rate
    private double aggregateRatings; // sum of all reviews, without calculating average

    public Media(String name, int releaseDate, int durationInMinutes) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.durationInMinutes = durationInMinutes;
        this.totalReviews = 0;
        this.reviews = 0.0;
        this.aggregateRatings = 0.0;
    }

    public String getName() {
        return name;
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

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }
    
    // add a new media in the list
    protected Media[] addSomething(Media newMedia, Media[] media) {
        Media[] newLMedias = new Media[media.length + 1];

        for (int i = 0; i < newLMedias.length; i++) {
            if(i == newLMedias.length - 1) break;
            newLMedias[i] = media[i];
        }

        newLMedias[newLMedias.length - 1] = newMedia;
        return newLMedias;
    }

    // remove a media from the list
    protected Media[] removeSomething(Media[] media, String typeMedia, String textInputIndex) {
        for (int i = 0; i < media.length; i++) {
            System.out.println(i + typeMedia);
        }
        int index = Help.listeningInt(textInputIndex);

        Media[] newLMedias = new Media[media.length - 1];

        for (int i = 0; i < media.length; i++) {
            if (i != index) newLMedias[i] = media[i];
        }

        return newLMedias;
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

    public void showStatus() {
        Help help = new Help();
        StringBuilder line = help.split(30);

        System.out.println(line);
        System.out.println("Name" + this.name);
        System.out.println("Realese date: " + this.releaseDate);
        System.out.println("Duration: " + this.durationInMinutes + "min");
        System.out.println("Rating: " + this.reviews);

        System.out.println(line);
    }

    public void watch() {
        System.out.println("Watching " + this.name);
    }
}
