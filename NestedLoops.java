import java.util.Scanner;
/**
 * This class prints a pattern of rows and columns
 *
 * @author Shawn Mathews
 * @version 1.0
 */
public class NestedLoops {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        columns = scanner.nextInt();

        System.out.print("Enter the symbol to use: ");
        symbol = scanner.next().charAt(0);

    for (int j = 0; j < rows; j++) {
        for (int i = 0; i < columns; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }

        scanner.close();


    }
}
