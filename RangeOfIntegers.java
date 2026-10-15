import java.util.Scanner; // import scanner class
/**
 * This class finds sum of numbers inside and outside the range
 *
 * @author Shawn Mathews
 * @version 1.0
 */
public class RangeOfIntegers{ // name of class
// start of class
    public static void main(String[] args) { 
    // start of main method

        // create scanner object
        Scanner scanner = new Scanner(System.in);

        // prompt user for start of range
        System.out.print("Enter an integer for the start of the range: ");
        int start = scanner.nextInt(); 

        // prompt user for end of range
        System.out.print("Enter an integer for the end of the range: ");
        int end = scanner.nextInt(); 

        int insideSum = 0; // initialize sum for numbers inside range
        int outsideSum = 0; // initialize sum for numbers outside range
        int number; // declare variable 

        // do-while loop to process user numbers until 0 is entered
        do 
        { // start of do-while loop
            System.out.print("Enter an integer or zero (0) to end: ");
            number = scanner.nextInt(); 

            // check if input is non-zero to avoid adding value to sum
            if (number != 0) 
            { // start of if block

                // check if number falls within the range 
                if (number >= start && number <= end) 
                { // start of nested if block
                    insideSum += number; 
                } // end of nested if block
                else 
                { // start of nested else block
                    outsideSum += number; 
                } // end of nested else block

            } // end of if block

        } while (number != 0); // end of do-while loop

        // display total sums
        System.out.println("The sum of the integers inside the range is " + insideSum);
        System.out.println("The sum of the integers outside the range is " + outsideSum);

        scanner.close(); // close scanner object
    } // end of main method
} // end of class
