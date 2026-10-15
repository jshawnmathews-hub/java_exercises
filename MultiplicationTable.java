/**
 * This class prints multiplication table
 *
 * @author Shawn Mathews
 * @version 1.0
 */
public class MultiplicationTable{ // name of class
    // start of class
    public static void main (String[]args){
        // start of main method
        //Declare my variables here
        //This var will hold the  number that is multiplying by
        int multiplier = 9;

        //This var will hold the answer of the calculation inside the loop
        int answer = 0;

        // Loop from 0 to 12
        for (int i = 0; i <= 12; i++)
        {
            // calculate the multiplication
            answer = i * multiplier;

            //The next line will display the formatted row output to the user
            System.out.println(i + " X " + multiplier + " = " + answer);
        }

    } // end of main method
} // end of class
