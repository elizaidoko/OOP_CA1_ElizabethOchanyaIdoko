package ca;

import javax.swing.*;
import java.util.Arrays;

public class Album {
    private String name;
    private Song[] tracks;
    private String producer;
    private int releaseYear;

    public Album(String name, Song[] tracks, String producer, int releaseYear){
        setName(name);
        setTracks(tracks);
        setProducer(producer);
        setReleaseYear(releaseYear);
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n\nProducer: " + getProducer() + "\n\nRelease Year: " + getReleaseYear() + "\n\nNumber of Tracks: " + getNumberOfTracks() + "\n\nTotal Playing Time: " + getPlayingTime();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Song[] getTracks() {
        return Arrays.copyOf(tracks,tracks.length);
    }

    public void setTracks(Song[] tracks) {
        if(tracks != null)
            this.tracks = Arrays.copyOf(tracks,tracks.length);
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getNumberOfTracks(){
        int number;
        number = getTracks().length;
        return number;
    }

    public int getPlayingTime(){
        int total=0;

        for(int i = 0; i < getTracks().length;i++){
            total += getTracks()[i].getDuration();

        }
        return total;
    }

    public void playTrack(int t){
        if(t >= 0 && t <= getTracks().length){
            JOptionPane.showMessageDialog(null,"Now Playing track - details are as follows: \n\n" + getTracks()[t-1].toString(),"Playing Track",JOptionPane.INFORMATION_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(null,"An invalid track number was supplied!","Bad Track Number",JOptionPane.ERROR_MESSAGE);
    }

    public void shuffle(){
        Song[] shuffled = new Song[getTracks().length];
        boolean[] alreadyPicked = new boolean[getTracks().length];
        int random;
        String output = "";

        for(int i=0;i<getTracks().length;i++){
            random =(int) (Math.random()* (getTracks().length) + 1);
            if(!alreadyPicked[random]){
                shuffled[i] = getTracks()[random];
            }
            else
            {
                random =(int) (Math.random()* (getTracks().length-1) + 1);
                shuffled[i] = getTracks()[random];
            }


            alreadyPicked[random] = true;
            if(shuffled[i] != null)
                output += "\n" + shuffled[i].toString();

        }

        JOptionPane.showMessageDialog(null,"Shuffled Playlist is as follows: \n\n " + output,"Shuffled Playlist",JOptionPane.INFORMATION_MESSAGE);
    }
}
