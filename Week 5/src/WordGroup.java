import java.util.HashSet;
import java.util.HashMap;

public class WordGroup {

	private String words;
	
	/*
	 * Constructor - converts the original word to lower case
	 */
	WordGroup(String original)
	{
		words = original.toLowerCase();
	}
	
	/*
	 * Split the words variable into seperate words to be returned as a string array
	 */
	public String[] getWordArray()
	{
		//Split the long string every time there is a space
		return words.split(" ");
	}
	
	/*
	 * Create a HashSet from 2 word groups
	 * Return a HashSet of type String
	 */
	public HashSet<String> getWordSet(WordGroup wordGroup)
	{
		HashSet<String> wordSet = new HashSet<String>();
		
		//Add each element from the current word group, and the supplied word group
		for(String word : this.getWordArray())
		{
			wordSet.add(word);
		}
		for(String word : wordGroup.getWordArray())
		{
			wordSet.add(word);
		}

		return wordSet;
	}
	
	/*
	 * Create a HashMap of all the words linked to their word count
	 * Return the HashMap
	 */
	public HashMap<String, Integer> getWordCounts()
	{
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		
		for (String word: getWordArray())
		{
			//If the word is already present, increment its value, otherwise add it to the hash map
			if (hashMap.containsKey(word))
			{
				hashMap.put(word, hashMap.get(word) + 1);
			}
			else
			{
				hashMap.put(word, 1);
			}
		}
		
		return hashMap;
	}
	
}
