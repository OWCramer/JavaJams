import java.io.File;
import java.util.Scanner;

public class MenuChoices{

    public static String starterChoice(){

        //Creates new scanner
        Scanner input = new Scanner(System.in);

        //Asks user what to do
        while (true){
            System.out.print("\nWhat would you like to do?\n(1.Make Track List)\n(2.View Track List)\n(3.Play Music)\n(4.Exit)\n: ");
            String choice = input.next();
            if (choice.equals("1") | choice.equals("2") | choice.equals("3") | choice.equals("4")){
                return choice;
            }else{
                System.out.println("You must enter a valid option");
            }
        }
    }

    public static String trackPick(File[] tracks){

        //Creates new scanner
        Scanner input = new Scanner(System.in);

        //Asks user what to do
        while (true){
            //asks user which song to play
            System.out.println("Which song would you like to play");
            TrackLists.currentTrackList(tracks);
            int choice = input.nextInt();
            if((tracks.length - (choice - 1)) >= 0){
                return tracks[choice - 1].getAbsolutePath();
            }else {
                System.out.println("That's not an option!");
            }
        }
    }

    public static int playingOptions(){

        //Creates new scanner
        Scanner input = new Scanner(System.in);

        //Asks user what to do
        while (true){
            //asks user which song to play
            System.out.println("Options (1.Return to main menu)(2.Stop)");
            int choice = input.nextInt();
            if(choice == 1 | choice == 2){
                return choice;
            }else{
                System.out.println("That's not an option!");
            }

        }
    }
}
