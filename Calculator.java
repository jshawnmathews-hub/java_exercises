import java.sql.SQLOutput;
import java.util.Scanner;
/**
 * This class performs the basic arithmetic operations on two numbers
 *
 * @author Shawn Mathews
 * @version 1.0
 */
public class Calculator {
    public static void main (String[] agrs){

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperation = true;


        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, ^) : ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        switch(operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2 ==0){
                    System.out.println("Can't divide by zero");
                    validOperation = false;
                }
                else{
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid operator");
                validOperation = false;
            }

        }
        if(validOperation) {
            System.out.println(result);
        }

        scanner.close();
    }

}
