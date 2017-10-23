public class GuessingGame {
	
	public static void main(String[] args) {
		Integer numberToGuess;
		Integer guessedNumber;
		Toolbox myToolbox = new Toolbox();
		
		System.out.println("Welcome to the guessing game!");
		
		numberToGuess = myToolbox.getRandomInteger(10);
		guessedNumber = myToolbox.readIntegerFromCmd();
		
		if(numberToGuess.equals(guessedNumber)) {
			System.out.println("You guessed the number!");
		}else if(numberToGuess < guessedNumber) {
			System.out.println("Your number is too large.");
		}else {
			System.out.println("You number is smaller.");
		}
	}
	
}