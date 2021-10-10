import java.io.File;
import java.util.Scanner;

public class MenuChoices {

    public static String starterChoice(){

        //Creates new scanner
        Scanner input = new Scanner(System.in);

        //Asks user what to do
        while (true){
            System.out.print("\nWhat would you like to do?\n(1.Make Track List)\n(2.View Track List)\n: ");
            String choice = input.next();
            if (choice.equals("1") | choice.equals("2")){
                return choice;
            }else{
                System.out.println("You must enter a valid option");
            }
        }
    }

    public static String playerChoice(){

        //Creates new scanner
        Scanner input = new Scanner(System.in);

        //Asks user what to do
        while (true){
            System.out.print("What would you like to do?(1. Make Track List): ");
            String choice = input.next();
            if (choice.equals("1") | choice.equals("2")){
                return choice;
            }else{
                System.out.println("You must enter a valid option");
            }
        }
    }

}
