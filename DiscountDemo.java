import java.util.Scanner; // import scanner class
/**
 * This class finds the discount for the purchase of bolts, nuts and washers
 *
 * @author Shawn Mathews
 * @version 1.0
 */

public class DiscountDemo{ // name of class
    // start of class
    public static void main(String[] args){
        // start of main method
        // declare constants for prices in cents
        final int BOLT_PRICE = 10; // cost of bolt in cents
        final int NUT_PRICE = 5; // cost of nut in cents
        final int WASHER_PRICE = 3; // cost of washer in cents


        // create scanner object
        Scanner scanner = new Scanner(System.in);


        // prompt user to enter number of bolts
        System.out.print("How many bolts would you like to purchase? ");
        int bolts = scanner.nextInt(); // read user input


        // prompt user to enter number of nuts
        System.out.print("How many nuts would you like to purchase? ");
        int nuts = scanner.nextInt(); // read user input


        // prompt user to enter number of washers
        System.out.print("How many washers would you like to purchase? ");
        int washers = scanner.nextInt(); // read user input


        // display order
        System.out.println("Number of bolts:               " + bolts);
        System.out.println("Number of nuts:                " + nuts);
        System.out.println("Number of washers:         " + washers);


        // create boolean for valid order
        boolean orderOk = true;


        // check if there are more bolts than nuts
        if (bolts > nuts)
        { // start of if block
            System.out.println("Check the Order - not enough nuts for the bolts you purchased."); // display nut error
            orderOk = false; // update order status
        } // end of if block


        // check if there are fewer washers than bolts
        if (washers < bolts)
        { // start of if block
            System.out.println("Check the Order - not enough washers for the bolts you purchased."); // display washer error
            orderOk = false; // update order status
        } // end of if block


        // check if the order has no errors
        if (orderOk)
        { // start of if block
            System.out.println("Order is OK."); // display order ok message
        } // end of if block


        // calculate total cost in cents
        int totalCost = (bolts * BOLT_PRICE) + (nuts * NUT_PRICE) + (washers * WASHER_PRICE);


        // display total cost
        System.out.println("Your total cost of the order is " + totalCost + " cents.");


        scanner.close(); // close scanner object
    } // end of main method
} // end of class

