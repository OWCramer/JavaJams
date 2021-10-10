import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

public class JavaJams {
    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {

        //Initializes Track List
        File[] tracks = new File[0];

        boolean playerActive = true;
        while(playerActive){

            //Start of main menu
            String menuChoice = MenuChoices.starterChoice();
            //asks user if they want to make a track list
            if (menuChoice.equals("1")) {
                tracks = TrackLists.listMaker();
                System.out.println("\nYour new track list is:");
                TrackLists.currentTrackList(tracks);
            }
            //lists current track list
            if (menuChoice.equals("2")) {
                System.out.println("\nYour current track list is:");
                if (tracks.length == 0){
                    System.out.println("You dont have any tracks or haven't made a track list with option 1!");
                }else {
                    TrackLists.currentTrackList(tracks);
                }
            }
            //Starts music player
            if (menuChoice.equals("3")) {
                if (tracks.length == 0){
                    System.out.println("\nYou dont have any tracks or haven't made a track list with option 1!");
                }else {
                    MusicPlayerView.musicPlayer(tracks);
                }

            }
            //asks user if they want to end program
            if (menuChoice.equals("4")) {
                playerActive = false;
            }
            //End of main menu

        }
    }
}
