import java.util.Scanner;

/**
 * This class inputs length and width, and finds the area
 *
 * @author Shawn Mathews
 * @version 1.0
 */
public class Area {
    public static void main(String[]args){

        double width = 0;
        double length = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the length: ");
        length = scanner.nextDouble();

        area = length * width;

        System.out.print("The area is: " + area + "m²");

        scanner.close();
    }
}
