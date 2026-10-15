import java.util.Scanner; // import scanner class
/**
 * This class finds the number of years it takes for starting bank balance to reach the required amount for post-secondary education.
 * with the interest rate provided
 *
 * @author Shawn Mathews
 * @version 1.0
 */
public class BankAccount { // name of class
// start of class
    public static void main(String[] args) { 
    // start of main method

        // create scanner object
        Scanner scanner = new Scanner(System.in);

        // prompt user for starting bank account balance
        System.out.print("Enter the starting bank account amount: ");
        double balance = scanner.nextDouble(); 

        // prompt user for yearly interest rate
        System.out.print("Enter the yearly interest rate (in percentage no % sign): ");
        double interestRate = scanner.nextDouble(); 

        // prompt user for required amount
        System.out.print("Enter the amount needed for post-secondary education: ");
        double targetAmount = scanner.nextDouble(); 

        int years = 0; // initialize year counter

        // while loop to compound interest until current balance exceeds target amount
        while (balance < targetAmount) 
        { // start of while loop
            balance += balance * (interestRate / 100.0); // calculate interest and update total balance
            years++; 
        } // end of while loop

        // display total years neeeded
        System.out.println("It will take " + years + " years for the starting bank account to reach the required amount for post-secondary education.");

        scanner.close(); // close scanner object
    } // end of main method
} // end of class
