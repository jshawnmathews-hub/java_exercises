import java.util.Scanner;
/**
 * This class inputs items bought and price and finds the total bill
 *
 * @author Shawn Mathews
 * @version 1.0
 */
public class ShoppingCart {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many would you like to buy?: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("You have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is: " + currency + total);

        scanner.close();

    }
}
