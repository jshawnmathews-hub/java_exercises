import java.util.Scanner; // import scanner class
/**
 * This class finds the average of n number of marks inputted
 *
 * @author Shawn Mathews
 * @version 1.0
 */
public class AverageMarks { // name of class
    // start of class
    public static void main(String[] args) {
        // start of main method

        // create scanner object
        Scanner scanner = new Scanner(System.in);

        // prompt user for number of marks
        System.out.print("How many marks will you enter today? ");
        int numMarks = scanner.nextInt();

        // variable to store sum of marks
        double totalSum = 0;

        // for loop to read in each mark
        for (int i = 1; i <= numMarks; i++)
        { // start of for loop
            System.out.print("Enter mark " + i + ": ");
            double mark = scanner.nextDouble();
            totalSum += mark;
        } // end of for loop

        // calculate average
        double average = totalSum / numMarks;

        // display total marks entered and average
        System.out.println("You have entered " + numMarks + " marks. The student's average is " + Math.round(average )+ "%.");

        // check if average is 49 or less
        if (average <= 49)
        { // start of if block
            System.out.println("The student is failing.");
        } // end of if block
        // check if average is 50 to 69
        else if (average >= 50 && average <= 69)
        { // start of else if block
            System.out.println("The student's performance is just under average.");
        } // end of else if block
        // check if average is 70 to 79
        else if (average >= 70 && average <= 79)
        { // start of else if block
            System.out.println("The student's performance is average.");
        } // end of else if block
        // check if average is above 80
        else if (average >= 80)
        { // start of else if block
            System.out.println("The student is on the honour roll.");
        } // end of else if block

        scanner.close(); // close scanner object
    } // end of main method
} // end of class
