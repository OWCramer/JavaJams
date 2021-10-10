import java.io.File;

public class TrackLists {

    //Compiles a track list
    public static File[] listMaker(){

        File trackList = new File("Tracks");

        return trackList.listFiles();
    }

    //current track list
    public static void currentTrackList(File[] tracks){
        for (int i = 0; i < tracks.length; i++) {
            if (i / 2 == 1) {
                System.out.println(" " + (i+1) + ". " + tracks[i].getName());
            } else {
                System.out.print((i+1) + ". " + tracks[i].getName());
            }
        }
    }
}
