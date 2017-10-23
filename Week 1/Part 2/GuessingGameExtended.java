import java.io.*;
import java.util.Random;

public class GuessingGameExtended {
	
	public static void main(String[] args) {
		Integer numberToGuess;
		Integer guessedNumber = 0;
		boolean guessed = false;
				
		System.out.println("Welcome to the guessing game!");
		
		//Generate a random number from 1 to 10 for the user to guess.
		Random rand = new Random();
		numberToGuess = new Integer(rand.nextInt(10) + 1);
		
		while(guessed == false) {
			//Get a guess from the user.
			System.out.println("Enter your number:");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String tempGuessedNumber = "";
			
			try {
				tempGuessedNumber = br.readLine();
			}
			catch(IOException ioe) { //Catches any input errors.
				System.err.println("Input error");
			}
			
			try {
				guessedNumber = new Integer(tempGuessedNumber);
			}
			catch(NumberFormatException e) { //Catches when the user enters something that is not an integer.
				System.err.println("Number format error: Enter an integer.");
			}
			
			//Compare the guess to the actual number.
			if(numberToGuess.equals(guessedNumber)) {
				System.out.println("You guessed the number!");
				guessed = true;
			}else if(numberToGuess < guessedNumber) {
				System.out.println("Your number is too large.");
			}else {
				System.out.println("You number is smaller.");
			}
		}
	}
	
}