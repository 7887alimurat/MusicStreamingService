package factory;

public class PopTrackFactory extends TrackFactory {
    @Override
    public Track createTrack(String title,
                             String artist,
                             int duration,
                             String lyrics){
        return new PopTrack(title,artist,duration,lyrics);
    }
}
