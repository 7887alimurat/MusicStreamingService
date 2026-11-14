package factory;

public class RockTrack implements Track{
    private final String title;
    private final String artist;
    private final int duration;
    private final String lyrics;

    public RockTrack(String title,String artist,int duration,String lyrics){
        this.title= title;
        this.artist=artist;
        this.duration=duration;
        this.lyrics=lyrics;
    }
    @Override
    public String getTitle(){
        return title;
    }
    @Override
    public String getArtist(){
        return artist;
    }
    @Override
    public int getDuration() {
        return duration;
    }
    @Override
    public String getLyrics() {
        return lyrics;
    }
    @Override
    public void play(){
        System.out.println("Playing Rock "+ title);
    }
}