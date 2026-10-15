import java.util.Scanner; // import the scanner class
/**
 * This class finds the amount in 10 years when an Interest rate is applied
 *
 * @author Shawn Mathews
 * @version 1.0
 */
public class InterestRate{ // name of class
// start of class
    public static void main(String[] args){ 
    // start of main method
        
        // declare and assign my variables and objects
        Scanner scanner = new Scanner(System.in); // scanner object
        double initial_value = 0.0; // will hold initial value
        double interest_rate = 0.0; // will hold interest rate
        double rate = 0.0; // will hold calculated rate
        double current_value = 0.0; // will hold the current value at the start of the year
        double interest = 0.0; // will hold the calculated interest for the year
        double new_value = 0.0; // will hold the calculated value at the end of the year
        final double percent_converter = 100.0; // will hold the constant for percentage conversion
        
        // ask the user for the initial value
        System.out.println("Enter initial value:");
        
        // take the user's initial value 
        initial_value = scanner.nextDouble();
        
        // ask the user for the  interest rate
        System.out.println("Enter interest rate:");
        
        // take the user's interest rate 
        interest_rate = scanner.nextDouble();
        
        // calculate the rate and set the starting current_value
        rate = interest_rate / percent_converter;
        current_value = initial_value;
        
        // to differentiate the two parts
        System.out.println("");
        
        // display the headers to the screen
        System.out.format("%-5s %-15s %s %18s\n", "Year", "Initial Value", "Interest Gained", "Current Value");
        
        // Year 1
        interest = current_value * rate;
        new_value = current_value + interest;
        System.out.format("%2d      $ %-15.2f  $ %-15.2f  $ %-15.2f\n", 1, current_value, interest, new_value);
        current_value = new_value;
        
        // Year 2
        interest = current_value * rate;
        new_value = current_value + interest;
        System.out.format("%2d      $ %-15.2f  $ %-15.2f  $ %-15.2f\n", 2, current_value, interest, new_value);
        current_value = new_value;
        
        // Year 3
        interest = current_value * rate;
        new_value = current_value + interest;
        System.out.format("%2d      $ %-15.2f  $ %-15.2f  $ %-15.2f\n", 3, current_value, interest, new_value);
        current_value = new_value;
        
        // Year 4
        interest = current_value * rate;
        new_value = current_value + interest;
        System.out.format("%2d      $ %-15.2f  $ %-15.2f  $ %-15.2f\n", 4, current_value, interest, new_value);
        current_value = new_value;
        
        // Year 5
        interest = current_value * rate;
        new_value = current_value + interest;
        System.out.format("%2d      $ %-15.2f  $ %-15.2f  $ %-15.2f\n", 5, current_value, interest, new_value);
        current_value = new_value;
        
        // Year 6
        interest = current_value * rate;
        new_value = current_value + interest;
        System.out.format("%2d      $ %-15.2f  $ %-15.2f  $ %-15.2f\n", 6, current_value, interest, new_value);
        current_value = new_value;
        
        // Year 7
        interest = current_value * rate;
        new_value = current_value + interest;
        System.out.format("%2d      $ %-15.2f  $ %-15.2f  $ %-15.2f\n", 7, current_value, interest, new_value);
        current_value = new_value;
        
        // Year 8
        interest = current_value * rate;
        new_value = current_value + interest;
        System.out.format("%2d      $ %-15.2f  $ %-15.2f  $ %-15.2f\n", 8, current_value, interest, new_value);
        current_value = new_value;
        
        // Year 9
        interest = current_value * rate;
        new_value = current_value + interest;
        System.out.format("%2d      $ %-15.2f  $ %-15.2f  $ %-15.2f\n", 9, current_value, interest, new_value);
        current_value = new_value;
        
        // Year 10
        interest = current_value * rate;
        new_value = current_value + interest;
        System.out.format("%2d      $ %-15.2f  $ %-15.2f  $ %-15.2f\n", 10, current_value, interest, new_value);
        current_value = new_value;
        
        scanner.close(); // closes the Scanner object
        
    } // end of main method
} // end of class
