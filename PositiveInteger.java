import java.util.Scanner; // import scanner class
/**
 * This class prints the input number till 0 in descending order
 *
 * @author Shawn Mathews
 * @version 1.0
 */
public class PositiveInteger { // name of class
// start of class
    public static void main(String[] args) { 
    // start of main method

        // create scanner object
        Scanner scanner = new Scanner(System.in);

        int number; // declare variable 

        // attempt to get positive number
        System.out.println("Enter a positive integer:");

        // do-while loop to validate positive number
        do 
        { // start of do-while loop
            number = scanner.nextInt(); 

            // check if user entered zero or a negative number
            if (number <= 0) 
            { // start of if block
                System.out.println("Invalid input. Please enter a positive integer:"); 
            } // end of if block

        } while (number <= 0); // end of do-while loop

        // display countdown header message
        System.out.println("Counting down from " + number + ":");

        int current = number; // set starting count

        // do-while loop to perform countdown to zero
        do 
        { // start of do-while loop
            System.out.println(current); 
            current--; 
        } while (current >= 0); // end of do-while loop

        scanner.close(); // close scanner object
    } // end of main method
} // end of class
