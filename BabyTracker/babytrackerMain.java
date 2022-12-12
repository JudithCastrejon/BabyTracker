import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class babytrackerMain {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner homeInput = new Scanner(System.in);
        String babyName;
        int babyAge;

        System.out.println("Welcome, please enter your babys name:  ");
        babyName = homeInput.nextLine(); // reading user inputs

        System.out.println("\nNow please enter babys age in months please. ");
        babyAge = homeInput.nextInt();

        System.out.println("This is the menu");
        int selection = 0; // declaring variable
        do {
            System.out.println("-------------------------");
            System.out.println("[1] Feeding ");
            System.out.println("[2] View Feedings ");
            System.out.println("[3] Suggestions (schedule & foods) ");
            System.out.println("[4] Babies Information (milestones)");
            System.out.println("[0] Exit ");
            System.out.println("-------------------------");

            // creating a new scanner because of error purposes
            Scanner menuInput = new Scanner(System.in);

            System.out.println("\nTo begin, please enter your selection from the menu ");
            selection = menuInput.nextInt();// reading user input

            // setting menu to the functions/classes
            switch (selection) {
                case 1:
                    System.out.println("\nYou have picked Feeding");

                    // creating a feeding object
                    Feeding feed = new Feeding(babyAge, babyName);
                    try {
                        feed.feeding(babyAge, babyName);
                    } catch (IOException e) {
                        System.out.println("File not found error -- Feeding");
                        e.printStackTrace();
                    }
                    break;

                case 2:
                    System.out.println("\nYou have picked View Feedings");

                    ViewFeedings see = new ViewFeedings();
                    see.reading();
                    break;

                case 3:
                    System.out.println("\nYou have picked Suggestions");
                    // object of feeding suggestions class
                    FeedingSuggestions suggest = new FeedingSuggestions(babyAge, babyName);
                    suggest.scheduleSugg();

                    break;

                case 4:
                    System.out.println("\nYou have picked Babies Information");
                    Information info = new Information(babyAge, babyName);
                    info.babyMilestone(babyAge);


                    break;

                case 0:
                    System.out.println("\nYou exited the application");
                    break;

                default:
                    System.out.println("\nThe selection is invalid");
                    ;
            }
        } while (selection != 0);
        System.exit(0);
    }

}