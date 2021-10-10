import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;


public class MusicPlayerView {
    public static void musicPlayer(File[] tracks) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        //player view
        boolean playing = true;
        while (playing){

            //makes chosen song the track file
            File trackPicked = new File(MenuChoices.trackPick(tracks));

            AudioInputStream audioStream = AudioSystem.getAudioInputStream(trackPicked);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            clip.start();

            while (clip.getMicrosecondLength() != clip.getMicrosecondPosition()){
                if(MenuChoices.playingOptions() == 1){
                    playing = false;
                    break;
                }
                if(MenuChoices.playingOptions() == 2){
                    clip.stop();
                }
            }

        }
    }
}
