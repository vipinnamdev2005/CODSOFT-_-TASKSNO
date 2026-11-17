import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        String playAgain;

        do {

            int number = random.nextInt(100) + 1;
            int attempts = 0;
            int guess = 0;
            int maxAttempts = 7;

            System.out.println("\n===== NUMBER GUESSING GAME =====");
            System.out.println("Guess a number between 1 and 100");
            System.out.println("You have 7 attempts.");

            while (attempts < maxAttempts) {

                System.out.print("Enter your guess: ");
                guess = sc.nextInt();

                attempts++;

                if (guess == number) {

                    System.out.println("Correct Guess!");
                    System.out.println("Attempts: " + attempts);

                    score++;
                    break;

                } else if (guess > number) {

                    System.out.println("Too High! Try again.");

                } else {

                    System.out.println("Too Low! Try again.");

                }
            }

            if (guess != number) {
                System.out.println("Game Over!");
                System.out.println("Correct Number was: " + number);
            }

            System.out.println("Your Score: " + score);

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = sc.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("\nThanks for playing!");

        sc.close();
    }
}