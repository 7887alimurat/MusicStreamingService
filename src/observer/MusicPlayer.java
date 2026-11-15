package observer;

import factory.Track;
java.util.ArrayList;
java.util.List;

public class MusicPlayer implements MusicSubject {

    private final List<MusicObserver> observers =
            new ArrayList<>();

    private Track currentTrack;

    @Override
    public void addObserver(MusicObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(MusicObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (MusicObserver observer : observers) {
            observer.update(currentTrack);
        }
    }

    public void play(Track track) {

        this.currentTrack = track;

        System.out.println("Now playing: " + track.getTitle());

        notifyObservers();

    }

    public Track getCurrentTrack() {
        return currentTrack;
    }
}
