import java.util.Scanner; // import scanner class
/**
 * This class finds the sum of even numbers
 *
 * @author Shawn Mathews
 * @version 1.0
 */
public class SumOfIntegers { // name of class
// start of class
    public static void main(String[] args) { 
    // start of main method

        // create scanner object
        Scanner scanner = new Scanner(System.in);

        // prompt user for positive integer
        System.out.print("Enter a positive integer: ");
        int limit = scanner.nextInt(); 

        int sum = 0; // initialize sum variable
        int current = 1; // start counter at 1

        // do-while loop to sum even numbers
        do 
        { // start of do-while loop

            // check if current number is even
            if (current % 2 == 0) 
            { // start of if block
                sum += current; 
            } // end of if block

            current++; 

        } while (current <= limit); // end of do-while loop

        // display sum
        System.out.println("Sum of even numbers from 1 to " + limit + " is: " + sum);

        scanner.close(); // close scanner object
    } // end of main method
} // end of class
