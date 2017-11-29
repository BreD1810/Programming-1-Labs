public class FlashCard 
{

	String question, answer;
	
	/*Constructor
	 * Set the question and answer*/
	public FlashCard(String question, String answer)
	{
		this.question = question;
		this.answer = answer;
	}
	
	/*Return the question*/
	public String getQuestion()
	{
		return question;
	}
	
	/*Return the answer*/
	public String getAnswer()
	{
		return answer;
	}
}
