import java.util.Scanner; // import the scanner class
/**
 * This class converts the input cents to dollars value
 *
 * @author Shawn Mathews
 * @version 1.0
 */
public class CentsToDollars { // name of class
// start of class
    public static void main(String[] args){ 
    // start of main method
        
        // declare and assign my variables and objects
        Scanner scanner = new Scanner(System.in); // scanner object
        int total_cents = 0; // will hold total cents
        int dollars = 0; // will hold dollars
        int cents = 0; // will hold remaining cents
        final int CENTS_IN_DOLLAR = 100; // will hold the constant for conversion
        
        // ask for the amount in cents
        System.out.println("Input the cents please:");
        
        // take the total cents 
        total_cents = scanner.nextInt();
        
        // calculate dollars and cents using formulas
        dollars = total_cents / CENTS_IN_DOLLAR;
        cents = total_cents % CENTS_IN_DOLLAR;
        
        // to differentiate the two parts
        System.out.println("");
        
        // display the results to the screen
        System.out.println("That is " + dollars + " dollars and " + cents + " cents");
        
        scanner.close(); // closes the Scanner object
        
    } // end of main method
} // end of class
