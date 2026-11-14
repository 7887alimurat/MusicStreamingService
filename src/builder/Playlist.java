package builder;
import factory.Track;
import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private final String name;
    private final List<Track> songs;

    public Playlist(String name, List<Track> songs){
        this.name=name;
        this.songs= new ArrayList<>(songs);
    }
    public String getName(){
        return name;
    }
    public List<Track> getSongs(){
        return new ArrayList<>(songs);
    }
    public void showPlayList(){
        System.out.println("Playlist: "+ name);

        for (Track song: songs){
            System.out.println("- " + song.getTitle() + "by"+ song.getArtist());
        }
    }

}
