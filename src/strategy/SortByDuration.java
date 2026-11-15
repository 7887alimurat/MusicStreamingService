package strategy;
import factory.Track;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortByDuration implements SortStrategy {

    @Override
    public List<Track> sort(List<Track> tracks) {

        List<Track> sortedTracks = new ArrayList<>(tracks);

        sortedTracks.sort(Comparator.comparingInt
                (Track::getDuration)
        );

        return sortedTracks;
    }
}