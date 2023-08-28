import java.util.Scanner;
import java.util.Random;

public class number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Number Guessing Game!");

        boolean playAgain = true;
        int currentRound = 1;
        int totalScore = 0;

        while (playAgain && currentRound <= 3) {
            int maxAttempts = 0;

            switch (currentRound) {
                case 1:
                    maxAttempts = 30;
                    break;
                case 2:
                    maxAttempts = 20;
                    break;
                case 3:
                    maxAttempts = 10;
                    break;
            }

            int numberToGuess = random.nextInt(100) + 1;
            int numberOfTries = playRound(scanner, numberToGuess, maxAttempts);
            int roundScore = calculateScore(maxAttempts, numberOfTries);

            if (numberOfTries <= maxAttempts) {
                System.out.println("Congratulations! You've guessed the number in " + numberOfTries + " tries.");
                System.out.println("Round " + currentRound + " score: " + roundScore);
                totalScore += roundScore;

                if (currentRound < 3) {
                    System.out.println("Moving on to the next round...");
                    currentRound++;
                } else {
                    double convertedScore = (double) totalScore / 60 * 100;
                    System.out.println("Congratulations! You've completed all rounds.");
                    System.out.println("Total Score: " + convertedScore + " out of 100");
                    playAgain = false;
                }
            } else {
                System.out.println("Sorry, you've run out of attempts. The number was: " + numberToGuess);
                System.out.println("Round " + currentRound + " score: 0");
                double convertedScore = (double) totalScore / 60 * 100;
                System.out.println("Total Score: " + convertedScore + " out of 100");
                playAgain = false;
            }
        }

        scanner.close();
    }

    public static int playRound(Scanner scanner, int numberToGuess, int maxAttempts) {
        System.out.println("A number has been selected between 1 and 100. You have " + maxAttempts + " attempts.");

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Attempt " + attempt + ": Enter your guess: ");
            int userGuess = scanner.nextInt();

            if (userGuess < numberToGuess) {
                System.out.println("Try a higher number.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Try a lower number.");
            } else {
                return attempt;
            }
        }

        return maxAttempts + 1;
    }

    public static int calculateScore(int maxAttempts, int numberOfTries) {
        return maxAttempts - (numberOfTries - 1);
    }
}
