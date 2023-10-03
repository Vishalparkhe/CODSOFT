package numbergame;

import java.util.Random;
import java.util.Scanner;

 class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
     
        int minimumRange = 1;
        int maximumRange = 100;
        int attemptsLimit = 5;
        int rounds = 0;
        int totalAttempts = 0;
        int totalRoundsWon = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between " + minimumRange + " TO " + maximumRange);

        boolean playAgain = true;
        while (playAgain) {
            int targetNumber = random.nextInt(maximumRange - minimumRange + 1) + minimumRange;
            int attempts = 0;
          // System.out.println(targetNumber);
            System.out.println("Round " + (rounds + 1) + ":");
            while (attempts < attemptsLimit) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;
                totalAttempts++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the Right number in " + attempts + " attempts.");
                    totalRoundsWon++;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Your guess is too low.");
                } else {
                    System.out.println("Your guess is too high.");
                }

                if (attempts < attemptsLimit) {
                    System.out.println("You have " + (attemptsLimit - attempts) + " attempts left.");
                } else {
                	 System.out.println("GAME OVER");
                    System.out.println("Sorry, you've reached the maximum number of attempts. The Target number was " + targetNumber + ".");
                }
            }
         

            System.out.println("Do you want to play again? (yes/no): ");
            System.out.print("please type yes/no in lower case ");
            String playAgainResponse = scanner.next().toLowerCase();
            if (!playAgainResponse.equals("yes")) {
                playAgain = false;
            }

            rounds++;
        }

        System.out.println("Thanks for playing!");
        System.out.println("Total rounds played: " + rounds);
        System.out.println("Total rounds won: " + totalRoundsWon);
        System.out.println("Total attempts: " + totalAttempts);

       // scanner.close();
    }
}





