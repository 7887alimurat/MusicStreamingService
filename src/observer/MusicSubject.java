package observer;

public interface MusicSubject {

    void addObserver(MusicObserver observer);

    void removeObserver(MusicObserver observer);

    void notifyObservers();

}
