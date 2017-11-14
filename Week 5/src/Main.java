import java.util.HashSet;
import java.util.HashMap;

public class Main {

	public static void main(String[] args)
	{
		/*Create 2 word group objects using supplied quotes*/
		WordGroup group1 = new WordGroup("You can discover more about a person in an hour of play than in a year of conversation");
		WordGroup group2 = new WordGroup("When you play play hard when you work dont play at all");
		
		/*Create 2 string arrays from these sentences.*/
		String[] group1Array = group1.getWordArray();
		String[] group2Array = group2.getWordArray();
		
		/*Print out each word in both arrays*/
		System.out.println("Here are the elemenents in the first array:");
		for (String word : group1Array)
		{
			System.out.println(word);
		}
		System.out.println();
		System.out.println("Here are the elements in the second array:");
		for (String word : group2Array)
		{
			System.out.println(word);
		}
		
		/*Create a word set from both sentences and print all the words from it*/
		HashSet<String> wordSet = group1.getWordSet(group2);
		System.out.println();
		System.out.println("Here is the word set:");
		for (String word : wordSet)
		{
			System.out.println(word);
		}
		
		/*Print the word counts for the first sentence*/
		HashMap<String, Integer> group1HashMap = group1.getWordCounts();
		System.out.println();
		System.out.println("Here is the count of words for the first group:");
		//Loop through all keys in the HashMap (the string part)
		for (String word : group1HashMap.keySet())
		{
			//Print the word, and get the word count value from the HashMap
			System.out.println(word + ": " + group1HashMap.get(word));
		}
		
		/*Print the word counts for the second sentence*/
		HashMap<String, Integer> group2HashMap = group2.getWordCounts();
		System.out.println();
		System.out.println("Here is the count of words for the second group:");
		//Loop through all keys in the HashMap (the string part)
		for (String word : group2HashMap.keySet())
		{
			//Print the word, and get the word count value from the HashMap
			System.out.println(word + ": " + group2HashMap.get(word));
		}
	}
	
}