import java.util.Scanner; // import the scanner class
/**
 * This class finds the change (toonies,loonies,quarters, dimes, nickels and cents.)
 * for the input cents
 *
 * @author Shawn Mathews
 * @version 1.0
 */
public class CorrectChange{ // name of class
// start of class
    public static void main(String[] args){ 
    // start of main method
        
        // declare and assign my variables and objects
        Scanner scanner = new Scanner(System.in); // scanner object
        int total_cents = 0; // will hold the total cents
        int remainder = 0; // will hold the remainder during calculations
        int toonies = 0; // will hold the number of toonies
        int loonies = 0; // will hold the number of loonies
        int quarters = 0; // will hold the number of quarters
        int dimes = 0; // will hold the number of dimes
        int nickels = 0; // will hold the number of nickels
        int pennies = 0; // will hold the number of pennies
        final int TOONIE_VAL = 200; // will hold the toonie value
        final int LOONIE_VAL = 100; // will hold the loonie value
        final int QUARTER_VAL = 25; // will hold the quarter value
        final int DIME_VAL = 10; // will hold the dime value
        final int NICKEL_VAL = 5; // will hold the nickel value
        
        // ask the amount in cents
        System.out.println("Input the cents please:");
        
        // take the total cents
        total_cents = scanner.nextInt();
        
        // calculate coin quantities
        toonies = total_cents / TOONIE_VAL;
        remainder = total_cents % TOONIE_VAL;
        
        loonies = remainder / LOONIE_VAL;
        remainder = remainder % LOONIE_VAL;
        
        quarters = remainder / QUARTER_VAL;
        remainder = remainder % QUARTER_VAL;
        
        dimes = remainder / DIME_VAL;
        remainder = remainder % DIME_VAL;
        
        nickels = remainder / NICKEL_VAL;
        pennies = remainder % NICKEL_VAL;
        
        // to differentiate the two parts
        System.out.println("");
        
        // display the results to the screen
        System.out.println("Your change is: " + toonies + " toonies, " + loonies + " dollar, " + quarters + " quarters, " + dimes + " dime, " + nickels + " nickels and " + pennies + " cents.");
        
        scanner.close(); // closes the Scanner object
        
    } // end of main method
} // end of class
