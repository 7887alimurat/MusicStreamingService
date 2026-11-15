package observer;

import factory.Track;

public class LyricsDisplay implements MusicObserver {

    @Override
    public void update(Track track) {

        System.out.println("\n--- LYRICS ---");

        if (track.getLyrics() == null ||
                track.getLyrics().isEmpty()) {

            System.out.println("Lyrics not available.");

        } else {

            System.out.println(track.getLyrics());
        }

        System.out.println("----------");
    }
}