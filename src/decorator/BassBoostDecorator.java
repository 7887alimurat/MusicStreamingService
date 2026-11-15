package decorator;
import factory.Track;
public class BassBoostDecorator extends TrackDecorator {
    public BassBoostDecorator(Track wrappedTrack) {
        super(wrappedTrack);
    }

    @Override
    public void play() {
        super.play();
        System.out.println(
                "Bass Boost effect enabled (simulation)"
        ); } }