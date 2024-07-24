package com.java_project.movie;

import java.util.Date;
import java.util.Calendar;
import com.java_project.people.*;
import com.java_project.support.*;

public class Movie extends Media{
    // TODO: turn this better
    private People[][] actors;
    private People[] director;
    
    public Movie(String name, int releaseDate, int durationInMinutes, People[][] actors, People[] director) {
        super(name, releaseDate, durationInMinutes);
        this.actors = actors;
        this.director = director;
    }

    public People[][] getActors() {
        return actors;
    }

    public People[] getDirector() {
        return director;
    }

    // TODO: addActor, addDirector, removeActor, removeDirector
    public void addActor(People newActor) {
        for(i = 0; i < this.actors.length; i++){
            
        }
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
            System.out.println(split.split(30));
        }
    }

    @Override
    public void showStatus() {
        super.showStatus();
        
        System.out.println("Actors:");
        showActors();
    }
}
