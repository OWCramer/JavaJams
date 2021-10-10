import java.io.File;

public class JavaJams {
    public static void main(String[] args) {

        //Initializes Track List
        File[] tracks = new File[0];

        boolean playerActive = true;
        while(playerActive){

//Start of manin menu
            String menuChoice = MenuChoices.starterChoice();
            //asks user if they want to make a track list
            if (menuChoice.equals("1")) {
                tracks = TrackLists.listMaker();
                System.out.println("\nYour new track list is:");
                for (int i = 0; i < tracks.length; i++) {
                    System.out.println((i+1) + ". " + tracks[i].getName());
                }
            }
            //lists current track list
            if (menuChoice.equals("2")) {
                System.out.println("\nYour current track list is:");
                if (tracks.length == 0){
                    System.out.println("You dont have any tracks or haven't made a track list with option 1!");
                }else {
                    for (int i = 0; i < tracks.length; i++) {
                        System.out.println(tracks[i].getName());
                    }
                }
            }

//End of main menu


        }
    }
}
