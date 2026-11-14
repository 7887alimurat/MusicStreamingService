import factory.*;
import builder.*;
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