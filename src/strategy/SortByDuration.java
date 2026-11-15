package strategy;
import factory.Track;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortByDuration implements SortStrategy {

    @Override
    public List<Track> sort(List<Track> tracks) {

        List<Track> sortedTracks = new ArrayList<>(tracks);

        sorted.sort(
                Comparator.comparing(
                        Track::getDuration,
                        String.CASE_INSENSITIVE_ORDER
                )
        );

        return sorted;
    }
}