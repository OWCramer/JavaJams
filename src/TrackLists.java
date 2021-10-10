import java.io.File;

public class TrackLists {

    //Compiles a track list
    public static File[] listMaker(){

        File trackList = new File("Tracks");

        File[] tracks = trackList.listFiles();

        return tracks;
    }
}
