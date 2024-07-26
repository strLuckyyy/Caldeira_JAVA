package com.java_project.movie;

public class Episodes extends Media{
    private String synopsis;
    private int episodeNumber;

    public Episodes(String name, int releaseDate, int durationInMinutes, String synopsis, int episodeNumber) {
        super(name, releaseDate, durationInMinutes);
        this.synopsis = synopsis;
        this.episodeNumber = episodeNumber;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }
}
