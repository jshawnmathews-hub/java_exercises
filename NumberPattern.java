/**
 * This class prints numbers in a pattern
 *
 * @author Shawn Mathews
 * @version 1.0
 */
public class NumberPattern { // name of class
    // start of class
    public static void main(String[] args) {
        // start of main method

        // outer for loop to iterate through 5 rows
        for (int i = 1; i <= 5; i++)
        { // start of outer for loop

            // inner for loop to print numbers
            for (int j = 1; j <= i; j++)
            { // start of inner for loop
                System.out.print(j + " ");
            } // end of inner for loop

            System.out.println(); // move to next line
        } // end of outer for loop

    } // end of main method
} // end of class

