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
                    if (i / 2 == 1) {
                        System.out.println(i+". "+tracks[i].getName());
                    } else {
                        System.out.print(i+". "+tracks[i].getName());
                    }
                }
            }
            //lists current track list
            if (menuChoice.equals("2")) {
                System.out.println("\nYour current track list is:");
                if (tracks.length == 0){
                    System.out.println("You dont have any tracks or haven't made a track list with option 1!");
                }else {
                    for (int i = 0; i < tracks.length; i++) {
                        if (i / 2 == 1) {
                            System.out.println(i+". "+tracks[i].getName());
                        } else {
                        System.out.print(i+". "+tracks[i].getName());
                        }
                    }
                }
            }
            //Starts music player
            if (menuChoice.equals("3")) {
                System.out.println("\nYour current track list is:");
                if (tracks.length == 0){
                    System.out.println("You dont have any tracks or haven't made a track list with option 1!");
                }else {
                    for (int i = 0; i < tracks.length; i++) {
                        if (i / 2 == 1) {
                            System.out.println(i+". "+tracks[i].getName());
                        } else {
                            System.out.print(i+". "+tracks[i].getName());
                        }
                    }
                    while(true){

                    }
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
