import java.util.Scanner; // import the scanner class
/**
 * This class prints the states and the capitals for each state
 *
 * @author Shawn Mathews
 * @version 1.0
 */
public class ProvinceCapitalDemo// name of class
{ // start of class
    public static void main(String[] args){
        // start of main method

        // declare and assign my variables and objects
        Scanner scanner = new Scanner(System.in); // scanner object
        String final_output = ""; // will hold all the provinces and capitals
        String place = null; // will hold the province
        String capital = null; // will hold the capital

        // ask the user for the 13 provinces and capitals
        System.out.println("Enter the 13 Canadian provinces and their capitals.");

        // to differentiate the two parts
        System.out.println("");

        // loop 13 times to collect all inputs from the keyboard
        for (int i = 1; i <= 13; i++) {

            // ask the user for a province
            System.out.println("Enter Province: " + i + ":");
            place = scanner.nextLine();

            // ask the user for its capital
            System.out.println("Enter its Capital:");
            capital = scanner.nextLine();

            // format it to the final output
            final_output = final_output + String.format("%-25s %s\n", place, capital);
        }

        // to differentiate the two parts
        System.out.println("");

        // display the column headers to the screen
        System.out.printf("%-25s %s\n", "Province/Territory", "Capital");

        // display the results to the screen
        System.out.print(final_output);

        scanner.close(); // closes the Scanner object

    } // end of main method
} // end of class
