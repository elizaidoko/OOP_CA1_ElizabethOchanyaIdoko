package ca;

public class Song {
    private static int trackID = 0;
    private int trackNumber;
    private String title;
    private String artist;
    private String genre;
    private int duration;
    private int releaseYear;

    public Song(String title,String artist,String genre, int duration, int releaseYear){
        setTitle(title);
        setArtist(artist);
        setGenre(genre);
        setDuration(duration);
        setReleaseYear(releaseYear);
        setTrackNumber();
    }

    @Override
    public String toString() {
        return "Track number: " + getTrackNumber() + "  Title: " + getTitle() + "  Artist: " + getArtist() + "  Genre: "+  getGenre() + "  Release year: " + getReleaseYear() + "  Duration: " + getDuration();
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber() {
        trackID++;
        this.trackNumber = trackID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
