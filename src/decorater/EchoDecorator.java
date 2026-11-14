package decorator;

import factory.Track;

public class EchoDecorator extends TrackDecorator {

    public EchoDecorator(Track wrappedTrack) {
        super(wrappedTrack);
    }

    @Override
    public void play() {
        super.play();

        System.out.println(
                "Echo effect enabled (simulation)"
        );
    }
}