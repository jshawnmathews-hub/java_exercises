import java.util.Scanner;
/**
 * This class applies compound interest to the input amount
 *
 * @author Shawn Mathews
 * @version 1.0
 */
public class Compound {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("The total amount of money earnt is $%.2f", amount);

        scanner.close();

    }

}
