package numberGuessingGame;

import java.util.Random;
import java.util.Scanner;

public class numberGuess {

	public static void main(String[] args) {
		int number;
	
		boolean isGuessed = false;

		Random random=new Random();
		number=random.nextInt(100)+1;
		System.out.println("Generated number is: "+number);
		
		Scanner sc=new Scanner(System.in);
		
		while (!isGuessed) {
            System.out.println("Guess any number between 1 to 100 (or enter 0 to quit): ");
            int guessedNum = sc.nextInt();

            if (guessedNum == 0) {
                System.out.println("You quit the game. The correct number was: " + number);
                break; // Exit the loop if the user wants to quit
            }

            if (guessedNum == number) {
                System.out.println("Congratulations! You guessed the right number.");
                isGuessed = true;
            } else if (guessedNum < number) {
                System.out.println("Oops! You guessed a lower number.");
            } else {
                System.out.println("Oops! You guessed a higher number.");
            }
        }

	}

}
