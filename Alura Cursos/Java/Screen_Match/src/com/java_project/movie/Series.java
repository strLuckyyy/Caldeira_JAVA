package com.java_project.movie;

import java.util.ArrayList;
import java.util.Set;

import com.java_project.people.Actors;
import com.java_project.support.Help;

public class Series extends Media{
    private int numSeasons;
    private ArrayList<Season> episodesPerSeason; //each index represents a 'Season' object containing all episodes of that season. Seasons are identified by their index.

    public Series(String name, Actors[][] actors, int releaseDate, int durationInMinutes, int seasons, ArrayList<Season> episodes) {
        super(name, actors, releaseDate, durationInMinutes);
        this.numSeasons = seasons;
        this.episodesPerSeason = episodes;
    } 

    public ArrayList<Season> getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public int getNumSeasons() {
        return numSeasons;
    }

    public void addNewSeason() {
        this.numSeasons++;
    }

    public void removeSeason(int season) {
        try {
            this.episodesPerSeason.remove(season);
        } catch (Exception e) {
            System.out.println("This season doesn't exist!");
        }
    }

    public void addEpisodes() {
        int seasonInt = Help.listeningInt("Which season do you want to add an episode to? ");
        if(seasonInt > this.numSeasons || seasonInt < this.numSeasons) {
            System.out.println("This season doesn't exist!");
            return;
        }

    }
    
}
