package com.java_project.movie;

import java.util.Date;
import java.util.Calendar;
import com.java_project.people.*;
import com.java_project.support.*;

public class Movie extends Media{
    private People[] actors;
    private People[] director;
    
    public Movie(String name, int releaseDate, int durationInMinutes, People[] actors, People[] director) {
        super(name, releaseDate, durationInMinutes);
        this.actors = actors;
        this.director = director;
    }

    public People[] getActors() {
        return actors;
    }

    public People[] getDirector() {
        return director;
    }

    // add a new actor or director in the list
    public void addPeople(People newPeople, People[] peopleList) {
        People[] newList = new People[peopleList.length + 1];
        
        for (int i = 0; i < newList.length; i++) {
            if(i == newList.length - 1) break;
            newList[i] = peopleList[i];
        }
        newList[newList.length - 1] = newPeople;

        if(peopleList == this.actors){
            this.actors = newList;
            return;
        }
        this.director = newList;
    }

    // remove from the list of actors or directors
    public void removePeople(People[] peopleList) {
        for (int i = 0; i < peopleList.length; i++) {
            System.out.println(i + " " + peopleList[i].getName());
        }
        
        int index = Help.listeningInt("Qual index? ");
        People[] newList = new People[peopleList.length - 1];

        for (int i = 0; i < peopleList.length; i++) {
            if(i != index){
               newList[i] = peopleList[i]; 
            }
        }

        if(peopleList == this.actors){
            this.actors = newList;
            return;
        }
        this.director = newList;
    }

    // it'll print on the console all of the people who work in the movie
    public void showPeople(People[] peopleList) {
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
        for (int i = 0; i < peopleList.length; i++) {
            System.out.println("Name: " + peopleList[i].getName());
            System.out.println("Age : " + peopleList[i].age(year, month, day));
            System.out.println("Movie's role: " + peopleList[i].getJob());
            System.out.println(split.split(30));
        }
    }

    @Override
    public void showStatus() {
        super.showStatus();
        
        System.out.println("Actors:");
        showPeople(this.actors);

        System.out.println("Directors:");
        showPeople(this.director);
    }
}
