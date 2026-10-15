import java.util.Scanner;
/**
 * This class finds the hypotenuse
 *
 * @author Shawn Mathews
 * @version 1.0
 */
public class Pythagoras {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The hypotenuse is: " + c + "m");

        scanner.close();
    }
}
