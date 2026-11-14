package builder;
import factory.Track;
import java.util.ArrayList;
import java.util.List;
public class PlaylistBuilder {
    private String name= "My playlist";
    private final List<Track> songs = new ArrayList<>();

    public PlaylistBuilder setName(String name){
        this.name=name;
        return this;
    }
    public PlaylistBuilder addSong(Track song){
        songs.add(song);
        return this;
    }
    public Playlist build(){
        return new Playlist(name,songs);
    }
}
