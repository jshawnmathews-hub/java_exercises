import java.util.Scanner; // import scanner class
/**
 * This class prints the fibonacci series of numbers
 * for an input number
 *
 * @author Shawn Mathews
 * @version 1.0
 */
public class Fibonacci { // name of class
// start of class
    public static void main(String[] args) { 
    // start of main method

        // create scanner object
        Scanner scanner = new Scanner(System.in);

        // prompt user for fibonacci limit
        System.out.println("Enter the limit for Fibonacci series:");
        int limit = scanner.nextInt(); 

        int first = 0; // initialize first term
        int second = 1; // initialize second term

        // while loop to generate fibonacci series up to limit
        while (first <= limit) 
        { // start of while loop
            System.out.print(first + " "); 

            int next = first + second; // calculate next term in sequence
            first = second; // shift second term to first term
            second = next; // update second term to next term
        } // end of while loop

        System.out.println(); // move to next line

        scanner.close(); // close scanner object
    } // end of main method
} // end of class
