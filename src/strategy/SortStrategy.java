package strategy;

import factory.Track;
import java.util.List;

public interface SortStrategy {
    List<Track> sort(List<Track> tracks);
}

