import java.util.Scanner;
/**
 * This class finds circumference, area and volume given a radius value
 *
 * @author Shawn Mathews
 * @version 1.0
 */
public class MTH {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("The circumference is: " + circumference + "m");
        System.out.println("The area is: " + area + "m²");
        System.out.println("The volume is: " + volume + "m³");

        scanner.close();

    }
}
