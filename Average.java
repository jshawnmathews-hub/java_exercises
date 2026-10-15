/**
 * This class finds the average of three double values
 *
 * @author Shawn Mathews
 * @version 1.0
 */
public class Average{ // name of class
    // start of class
    public static void main (String[]args){
        // start of main method
        //Declare my variables here
        //This var will hold the first number
        double num_1 = 56.9;
        //This var will hold the second number
        double num_2 = 89.7;
        //This will hold the third number
        double num_3 = 90.2;

        //This var will hold the sum
        double sum = 0.0;
        //This var will hold the answer of the average calculation
        double average = 0.0;

        // sum of the 3 numbers
        sum = num_1 + num_2 + num_3;

        // calculate the average
        average = sum / 3.0;

        //The next line will display output to the user
        System.out.println("The average of " + num_1 + ", " + num_2 + ", and " + num_3 + " is " + average + ".");

    } // end of main method
} // end of class
