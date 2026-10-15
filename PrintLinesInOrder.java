/**
 * This class prints the input lines in descending order
 *
 * @author Shawn Mathews
 * @version 1.0
 */
import java.util.Scanner; // import the scanner class
public class PrintLinesInOrder{ // main class
    // start of class
    public static void main(String[] args){
        // start of main method
        // declare and assign variables and objects
        Scanner scanner = new Scanner(System.in); // scanner object
        String line_1 = null; // will hold line 1
        String line_2 = null; // will hold line 2
        String line_3 = null; // will hold line 3
        String line_4 = null; // will hold line 4

        // ask the user for four lines of text
        System.out.println("Enter line 1:");
        line_1 = scanner.nextLine();
        System.out.println("Enter line 2:");
        line_2 = scanner.nextLine();
        System.out.println("Enter line 3:");
        line_3 = scanner.nextLine();
        System.out.println("Enter line 4:");
        line_4 = scanner.nextLine();

        // display the lines in reverse order (line 4 to line 1)
        System.out.println("Your output would be:");
        System.out.println(line_4);
        System.out.println(line_3);
        System.out.println(line_2);
        System.out.println(line_1);

        scanner.close(); // closes the Scanner object
    } // end of main method
} // end of class

