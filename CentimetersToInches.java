import java.util.Scanner; // import the scanner class
/**
 * This class converts the input value in cm to inches
 *
 * @author Shawn Mathews
 * @version 1.0
 */
public class CentimetersToInches{ // name of class
    // start of class
    public static void main(String[] args){
        // start of main method

        // declare and assign my variables and objects
        Scanner scanner = new Scanner(System.in); // scanner object
        final double constant = 2.54; // conversion constant
        double length_cm = 0.0; // will hold length in cm
        double length_in = 0.0; // will hold length in inches

        // ask the user for length in centimetres
        System.out.println("Enter length in cm:");
        length_cm = scanner.nextDouble();

        // calculate length in inches
        length_in = length_cm / constant;

        // display the results to the screen
        System.out.println("The length in inches is " + length_in);

        scanner.close(); // closes the Scanner object

    } // end of main method
} // end of class
