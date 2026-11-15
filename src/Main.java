import factory.*;
import builder.*;
import adapter.*;
import decorator.*;
public class Main {
    public static void main(String[] args){
        System.out.println("Music streaming service");
        //factory
        TrackFactory popFactory = new PopTrackFactory();
        TrackFactory rockFactory = new RockTrackFactory();

        Track song1 = popFactory.createTrack(
                "Mockinbird","Eminem", 240,"Daddy's gonna buy you a mockingbird\n" +
                        "I'ma give you the world\n" +
                        "I'ma buy a diamond ring for you\n" +
                        "I'ma sing for you\n" +
                        "I'll do anything for you to see you smile\n" +
                        "And if that mockingbird don't sing and that ring don't shine\n" +
                        "I'ma break that birdie's neck\n" +
                        "I'll go back to the jeweler who sold it to ya\n" +
                        "And make him eat every carat"
        );
        Track song2 = rockFactory.createTrack(
                "Sonne","Rammstein",180,"Fünf, hier kommt die Sonne\n" +
                        "Sechs, hier kommt die Sonne\n" +
                        "Sieben, sie ist der hellste Stern von allen\n" +
                        "Acht, neun, hier kommt die Sonne"
        );
        song1.play();
        song2.play();

        //adapter
        LegacyAudioPlayer legacyPlayer = new LegacyAudioPlayer(
                "Night Sky",
                "Unknown Artist",
                200,
                "Demo lyrics from external player"
        );
        Track adaptedTrack = new LegacyTrackAdapter(legacyPlayer);
        System.out.println("Title: " + adaptedTrack.getTitle());
        System.out.println("Artist: " + adaptedTrack.getArtist());
        System.out.println("Duration: " + adaptedTrack.getDuration());
        System.out.println("Lyrics: " + adaptedTrack.getLyrics());
        adaptedTrack.play();

        //decorator
        Track echoTrack = new EchoDecorator(song1);
        Track bassTrack = new BassBoostDecorator(song1);
        Track enhancedTrack =
                new BassBoostDecorator(
                        new EchoDecorator(song1)
                );
        System.out.println("\nPlaying with Echo: ");
        echoTrack.play();
        System.out.println("\nPlaying with Bass Boost: ");
        bassTrack.play();
        System.out.println("\nPlaying with Echo and Bass Boost: ");
        enhancedTrack.play();

        //builder
        Playlist playlist= new PlaylistBuilder()
                .setName("My favorite songs")
                .addSong(song1)
                .addSong(song2)
                .build();
        System.out.println();
        playlist.showPlayList();
    }
}