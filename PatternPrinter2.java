public class PatternPrinter2 { // name of class
    /**
     * This class prints a pattern of X and O
     *
     * @author Shawn Mathews
     * @version 1.0
     */
    // start of class
    public static void main(String[] args) {
        // start of main method

        // outer for loop to iterate through 10 rows
        for (int i = 1; i <= 10; i++)
        { // start of outer for loop

            // inner for loop to iterate through 10 columns
            for (int j = 1; j <= 10; j++)
            { // start of inner for loop

                // check if current row number is even
                if (i % 2 == 0)
                { // start of if block
                    System.out.print("O ");
                } // end of if block
                else
                { // start of else block
                    System.out.print("X ");
                } // end of else block

            } // end of inner for loop

            System.out.println(); // move to next line after row is complete
        } // end of outer for loop

    } // end of main method
} // end of class


