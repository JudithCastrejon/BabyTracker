
//[Feeding class that tracks baby's feeding]

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Feeding {

    // instance variables
    private int age;
    private String name;

    // feeding contructor
    public Feeding(int babyAge, String babyName) {
        this.age = babyAge;
        this.name = babyName;
    }

    Scanner FeedScanner = new Scanner(System.in); // new scanner

    // method for type of feeding displayed
    public void feeding(int babyAge, String babyName) throws IOException {

        // if statement to check for babys age and what type of feedin they can have,
        // below 6 months just milk, above 6 months 3 options milk, water, and food
        if (age <= 6) {

            System.out.println("\nWelcome to the feeding page, where you can log what " + babyName + " ate\n");
            System.out.println("Please enter the number of ounces that " + babyName + " ate (milk/formula)");
            String milkOunce = FeedScanner.nextLine(); // reading user inputs

            System.out.println("Now please enter the time. (Format hour:minute am/pm) ");
            String time = FeedScanner.nextLine(); // reading user input

            // open the file and appending to it
            FileWriter fw = new FileWriter("View_Feeding.txt", true);
            PrintWriter out = new PrintWriter(fw);

            // writing into the file
            out.println(milkOunce + " ounces of milk at " + time);

            // closing the file
            out.close();

        } else if (age >= 7) {
            // same as above but now with 3 options, because of babys age (milk, water,
            // food)
            System.out.println("\nWelcome to the feeding page, where you can log what " + babyName + " ate.\n");
            System.out.println(
                    "Please input what you would like to log\n  Milk\n  Water\n  Second Food \n  To terminate hit 0 \n !!!Write exactly like on screen!!!");

            String feedType = FeedScanner.nextLine(); // getting user input

            switch (feedType) {

                // For Milk intake
                case "Milk":
                    System.out.println("Please enter the number of ounces that " + babyName + " ate (milk/formula)");
                    String milkOunce = FeedScanner.nextLine(); // reading user inputs

                    System.out.println("Now please enter the time. (Format hour:minute am/pm) ");
                    String time = FeedScanner.nextLine(); // reading user input

                    // open the file
                    FileWriter fw = new FileWriter("View_Feeding.txt", true);
                    PrintWriter out = new PrintWriter(fw);

                    // writing into the file
                    out.println(milkOunce + " ounces of milk at " + time);

                    // closing the file
                    out.close();

                    break;

                // For Water intake
                case "Water":
                    System.out
                            .println("Please enter the number of ounces that your water that " + babyName + " drank.");
                    String waterOunce = FeedScanner.nextLine(); // reading user inputs

                    System.out.println("Now please enter the time. (Format hour:minute am/pm) ");
                    String watertime = FeedScanner.nextLine(); // reading user input

                    System.out.println("\nYou have successfully loged water intake");

                    // open the file
                    FileWriter fw1 = new FileWriter("View_Feeding.txt", true);
                    PrintWriter out1 = new PrintWriter(fw1);

                    // writing into the file
                    out1.println(waterOunce + " ounces of water at " + watertime);

                    // closing the file
                    out1.close();

                    break;

                // For food intake
                case "Second Food":
                    System.out.println("Please enter what " + babyName + " ate. ex. yogurt, apple, banana... etc");
                    String secFood = FeedScanner.nextLine(); // reading user inputs

                    System.out.println("Now please enter the time. (Format hour:minute am/pm) ");
                    String foodTime = FeedScanner.nextLine(); // reading user input
                    System.out.println("\nYou have successfully loged a second food feeding");

                    // open the file
                    FileWriter fw2 = new FileWriter("View_Feeding.txt", true);
                    PrintWriter out2 = new PrintWriter(fw2);

                    // writing into the file
                    out2.println("Ate "+secFood + " at " + foodTime);

                    // closing the file
                    out2.close();

                    break;
            }

            // application is only for babys below 1 year, exiting application if older than
            // 1
        } else {
            System.out.println(
                    "We are very sorry but this system is only meant to be used for babys under 1 year old.\nExiting the application now");
            System.exit(0);
        }

    }

    // getters and setters
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

}
