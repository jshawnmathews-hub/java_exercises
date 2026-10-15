import java.util.Random;
import java.util.Scanner;
/**
 * This class checks the input numbers against a randomly generated number
 *
 * @author Shawn Mathews
 * @version 1.0
 */
public class NumberGuess {
    public static void main (String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d\n", min, max);

        do {
            System.out.println("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("TOO LOW! Try once more");
            } else if (guess > randomNumber) {
                System.out.println("TOO HIGH! Try once more");
            }
            else{
                System.out.println("CORRECT! The number was " + randomNumber);
                System.out.println("Number of attempts: " + attempts);
            }
        }while (guess != randomNumber);
        scanner.close();

    }

}
