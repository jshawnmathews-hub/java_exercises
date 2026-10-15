import java.util.Scanner; // import scanner class
/**
 * This class finds the exponent value
 *
 * @author Shawn Mathews
 * @version 1.0
 */
public class Exponents { // name of class
// start of class
    public static void main(String[] args) { 
    // start of main method

        // create scanner object
        Scanner scanner = new Scanner(System.in);

        // prompt user for base number
        System.out.print("Enter the base: ");
        int base = scanner.nextInt(); 

        // prompt user for exponent
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt(); 

        int result = 1; // initialize result variable 
        int count = 0; // initialize loop counter 

        // while loop to calculate base raised to exponent
        while (count < exponent) 
        { // start of while loop
            result = result * base; 
            count++; 
        } // end of while loop

        // display calculated result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        scanner.close(); // close scanner object
    } // end of main method
} // end of class
