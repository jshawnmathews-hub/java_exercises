
/**
 * This class creates variables of different data types
 *
 * @author Shawn Mathews
 * @version 1.0
 */
public class VariablesDemo { // name of class


    // start of class
    public static void main (String[]args){
        // start of main method

        //Declare my variables here
        //This var will hold the subtotal cost of the meal
        double mealCost = 315.99;

        //These vars will hold the rates for tax and tip
        double TAX_RATE = 0.13;
        double TIP_RATE = 0.20;

        //This var will hold the number of people
        int numPeople = 5;

        //This var will hold the satisfaction rating
        char satisfaction = 'G';

        //This var will hold the value of whether the bill was split
        boolean isSplit = true;

        //Declare calculation variables and initialize to default values
        double taxAmount = 0.0;
        double tipAmount = 0.0;
        double totalCost = 0.0;
        double costPerPerson = 0.0;

        // calculate the tax amount
        taxAmount = mealCost * TAX_RATE;

        // calculate the tip amount
        tipAmount = mealCost * TIP_RATE;

        // calculate the total cost
        totalCost = mealCost + taxAmount + tipAmount;

        // calculate the cost per person
        costPerPerson = totalCost / numPeople;

        //These lines will display output to the user
        System.out.println("Subtotal: $" + mealCost);
        System.out.println("Tax Amount: $" + taxAmount);
        System.out.println("Tip Amount: $" + tipAmount);
        System.out.println("Total Cost Per Person: $" + costPerPerson);
        System.out.println("Satisfaction Rating: " + satisfaction);
        System.out.println("Was the bill split? " + isSplit);

    } // end of main method
} // end of class
