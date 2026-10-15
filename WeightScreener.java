import java.util.Scanner; // import scanner class
/**
 * This class checks if the input weight is enough for entering
 * the contest
 *
 * @author Shawn Mathews
 * @version 1.0
 */
public class WeightScreener{ // name of class
    // start of class
    public static void main(String[] args){
        // start of main method
        // declare constants for weight limits
        final double targetWeight = 91.0; // target weight in kg
        final double allowedMargin = 14.0; // allowed margin in kg
        final double minWeight = targetWeight - allowedMargin; // minimum weight in kg
        final double maxWeight = targetWeight + allowedMargin; // maximum weight in kg

        // create scanner object
        Scanner scanner = new Scanner(System.in);

        // prompt user to enter weight
        System.out.print("How much do you weigh? ");
        double weight = scanner.nextDouble(); // read user input

        // check if weight is within allowed range
        if (weight >= minWeight && weight <= maxWeight)
        { // start of if block
            System.out.println("You may enter the contest."); // display allowed message
        } // end of if block
        else
        { // start of else block
            System.out.println("You are not allowed in the contest."); // display denied message
        } // end of else block

        scanner.close(); // close scanner object
    } // end of main method
} // end of class

