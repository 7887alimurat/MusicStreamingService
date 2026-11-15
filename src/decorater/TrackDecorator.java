package decorator;
import factory.Track;
import java.util.Objects;
public abstract class TrackDecorator implements Track {
    protected final Track wrappedTrack;
    public TrackDecorator(Track wrappedTrack) {
        this.wrappedTrack = Objects.requireNonNull(wrappedTrack);
    }

    @Override
    public String getTitle() {return wrappedTrack.getTitle();}
    @Override
    public String getArtist() {return wrappedTrack.getArtist();}
    @Override
    public int getDuration() {return wrappedTrack.getDuration();}
    @Override
    public String getLyrics() {return wrappedTrack.getLyrics();}
    @Override
    public void play() {wrappedTrack.play();} }
