package adapter;

public class LegacyAudioPlayer {

    private final String songName;
    private final String performer;
    private final int lengthSeconds;
    private final String songLyrics;

    public LegacyAudioPlayer(
            String songName,
            String performer,
            int lengthSeconds,
            String songLyrics
    ) {
        this.songName = songName;
        this.performer = performer;
        this.lengthSeconds = lengthSeconds;
        this.songLyrics = songLyrics;
    }


    public String getSongName() {
        return songName;
    }

    public String getPerformerName() {
        return performer;
    }

    public int getLengthSeconds() {
        return lengthSeconds;
    }

    public String getSongText() {
        return songLyrics;
    }

    public void startLegacyPlayback() {
        System.out.println(
                "Legacy player is playing: " + songName
        );
    }
}