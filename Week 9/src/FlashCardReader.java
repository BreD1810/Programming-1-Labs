import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FlashCardReader 
{

	private BufferedReader reader;
	
	/*Constructor
	 * Create a bufferedreader for Questions.txt*/
	public FlashCardReader() 
	{
		try
		{
			reader = new BufferedReader(new FileReader("Questions.txt"));
		}
		catch(FileNotFoundException fnf)
		{
			//Print an error if the file is not found.
			System.err.println("Questions.txt not found!");
		}
	}
	
	/*Returns a line from the file and returns it*/
	private String getLine()
	{
		String line = "";
		try
		{
			line = reader.readLine();
		}
		catch(IOException ioe)
		{
			//Print an error if there is an IO exception.
			System.err.println("IO exception reading a line!");
		}
		return line;
	}
	
	/*Check if the file is ready to be read from*/
	private boolean checkFileRead()
	{
		boolean answer = false;
		
		try
		{
			answer = reader.ready();
		}
		catch(IOException ioe)
		{
			//Print an error if there is an IO exception.
			System.err.println("IO exception checking for file readiness!");
		}
		
		return answer;
	}
	
	/*return an array list of flashcards*/
	public ArrayList<FlashCard> getFlashCards()
	{
		ArrayList<FlashCard> cardList = new ArrayList<FlashCard>();
		
		//Loop while the file is still ready
		while(checkFileRead())
		{
			/*Get the line, split it on :,
			 * Add a new flash card to the arraylist*/
			String line = getLine();
			String[] splitLine = line.split(":");
			cardList.add(new FlashCard(splitLine[0], splitLine[1]));
		}
		
		return cardList;
	}
	
}
