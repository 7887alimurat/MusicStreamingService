package observer;

import factory.Track;

public class NowPlayingDisplay implements MusicObserver {

    @Override
    public void update(Track track) {

        System.out.println("\n--- NOW PLAYING ---");

        System.out.println("Song: " + track.getTitle());

        System.out.println("Artist: " + track.getArtist());

        System.out.println("Duration: " + track.getDuration()
        + " seconds");

        System.out.println("----------------");
    }
}
