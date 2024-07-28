package com.java_project.movie;

import com.java_project.support.Help;

public class Season extends Media{
    private Episodes[] episodes;
    private int totalEpisodes;

    public Season(String name, int releaseDate, Episodes[] episodes) {
        super(name, releaseDate, 0);
        this.episodes = episodes;
        this.totalEpisodes = episodes.length;
    }

    public Episodes[] getEpisodes() {
        return episodes;
    }

    public int getTotalEpisodes() {
        return totalEpisodes;
    }

    @Override
    public int getDurationInMinutes() {
        int totalDuration = 0;
        for (Episodes episode : this.episodes) {
            totalDuration += episode.getDurationInMinutes();
        }
        return totalDuration;
    }

    // add a new episode in the list
    public void addEpisode(Episodes newEpisode) {
        Episodes[] newList = new Episodes[this.totalEpisodes + 1];
        newList[this.totalEpisodes + 1] = newEpisode;
        this.episodes = newList;
    }

    // remove an episode from the list
    public void removeEpisode() {
        for (int i = 0; i < this.episodes.length; i++) {
            System.out.println(i + " " + this.episodes[i].getName());
        }
        int index = Help.listeningInt("Qual index? ");
        Episodes[] newList = new Episodes[this.episodes.length - 1];

        for (int i = 0; i < this.episodes.length; i++) {
            if(i != index){
               newList[i] = this.episodes[i]; 
            }
        }

        this.episodes = newList;
    }
}
