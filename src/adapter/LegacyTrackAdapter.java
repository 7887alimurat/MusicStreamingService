package adapter;
import factory.Track;
import java.util.Objects;

public class LegacyTrackAdapter implements Track {
    private final LegacyAudioPlayer legacyPlayer;
    public LegacyTrackAdapter(LegacyAudioPlayer legacyPlayer) {
        this.legacyPlayer = Objects.requireNonNull(legacyPlayer); }

    @Override
    public String getTitle() {return legacyPlayer.getSongName();}
    @Override
    public String getArtist() {return legacyPlayer.getPerformerName();}
    @Override
    public int getDuration() {return legacyPlayer.getLengthSeconds();}
    @Override
    public String getLyrics() {return legacyPlayer.getSongText();}
    @Override
    public void play() {legacyPlayer.startLegacyPlayback();} }
