package com.java_project.movie;

public class Series extends Media{
    private int numSeasons;
    private Season[] seasonEpisodeData; //each index represents a 'Season' object containing all episodes of that season. Seasons are identified by their index.

    public Series(String name, int releaseDate, int durationInMinutes, int numSeasons, Season[] episodesPerSeason) {
        super(name, releaseDate, durationInMinutes);
        this.numSeasons = numSeasons;
        this.seasonEpisodeData = episodesPerSeason;
    }

    public int getNumSeasons() {
        return numSeasons;
    }

    public Season[] getSeasonEpisodeData() {
        return seasonEpisodeData;
    }

    // add a season
    public void addSeason(Season newSeason) {
        this.seasonEpisodeData = (Season[]) addSomething(newSeason, this.seasonEpisodeData);
    }

    // remove a season
    public void removeSeason() {
        String type = "Season";
        String textInput = "Which season do you want to remove?(type the number): ";
        
        this.seasonEpisodeData = (Season[]) removeSomething(this.seasonEpisodeData, type, textInput);
    }
}
