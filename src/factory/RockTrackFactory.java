package factory;

public class RockTrackFactory extends TrackFactory {
    @Override
    public Track createTrack(String title,
                             String artist,
                             int duration,
                             String lyrics) {
        return new RockTrack(title, artist, duration, lyrics);
    }
}
