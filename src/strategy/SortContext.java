package strategy;

import factory.Track;
import java.util.List;

public class SortContext {

    private SortStrategy strategy;

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Track> sortSongs(List<Track> tracks) {

        if (strategy == null) {
            throw new IllegalStateException("Sorting strategy is not selected!");
        }

        return strategy.sort(tracks);
    }
}
