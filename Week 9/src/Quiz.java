import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Quiz
{
	
	FlashCardReader reader = new FlashCardReader();
	ArrayList<FlashCard> cardList;
	ArrayList<String> userAnswerList = new ArrayList<String>();
	
	/*Constructor
	 * Get an arraylist of flash cards.
	 * Start the quiz.*/
	public Quiz()
	{
		cardList = reader.getFlashCards();
		play();
	}
	
	/*Check if the user's answer matches the real answer,
	 * print a result, and ask if the user wants to save
	 * their results at the end.*/
	public void play()
	{
		Toolbox myToolbox = new Toolbox();
		String userAnswer = "";
		
		//Loop through all of the flash cards in the arraylist
		for(FlashCard card:cardList)
		{
			//Print the question, and get an answer
			System.out.println(card.getQuestion());
			userAnswer = myToolbox.readStringFromCmd();
			userAnswerList.add(userAnswer);
			
			//Convert both to lower case for easier comparison.
			if(userAnswer.toLowerCase().equals(card.getAnswer().toLowerCase()))
			{
				System.out.println("You are correct!");
			}
			else
			{
				System.out.print("You are incorrect. The correct answer was: ");
				System.out.print(card.getAnswer());
				System.out.println();
			}
		}
		
		//Check if the user wants to save the result.
		System.out.println("Would you like to save results?");
		userAnswer = myToolbox.readStringFromCmd();
		
		if(userAnswer.toLowerCase().equals("yes"))
		{
			//If they do, run the save method.
			System.out.println("Saving...");
			save();
		}
		else
		{
			System.out.println("Not saving...");
		}
	}
	
	/*Save the question, given answer and correctness
	 * to save.txt*/
	public void save()
	{
		PrintStream output = null;
		
		try
		{
			//Create a print stream to the file "save.txt"
			output = new PrintStream("save.txt");
		}
		catch(FileNotFoundException fnf)
		{
			//Print an error if the file is not found
			System.err.println("save.txt was not found!");
		}
		
		float total = 0;
		float numberCorrect = 0;
		
		//Loop through all of the answers from the user
		for(int i = 0; i<userAnswerList.size(); i++)
		{
			//Increase the total amount of questions
			total++;
			
			//Check if the user was correct
			if(userAnswerList.get(i).equals(cardList.get(i).getAnswer()))
			{
				/* If they're correct:
				 * Print the question, their answer and correct. 
				 * Also increase the amount of correct answers.*/
				output.println(cardList.get(i).getQuestion() + ", " + userAnswerList.get(i) + ", correct.");
				numberCorrect++;
			}
			else
			{
				/* If they're incorrect:
				 * Print the question, their answer and incorrect*/
				output.println(cardList.get(i).getQuestion() + ", " + userAnswerList.get(i) + ", incorrect.");
			}
		}
		
		//Print the amount of questions asked, and the total number correct.
		output.println("Questions asked: " + total + ". Percentage correct: " + ((numberCorrect/total) * 100) + "%");
		
	}
	
	/*Main method, create a quiz*/
	public static void main(String[] args)
	{
		Quiz myQuiz = new Quiz();
	}
	
}
