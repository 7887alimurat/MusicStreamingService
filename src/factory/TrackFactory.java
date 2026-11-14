package factory;
public abstract class TrackFactory {
    public abstract Track createTrack(
            String title,
            String artist,
            int duration,
            String lyrics);
}
