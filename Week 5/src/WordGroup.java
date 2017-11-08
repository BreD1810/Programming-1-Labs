import java.util.HashSet;
import java.util.HashMap;

public class WordGroup {

	private String words;
	
	WordGroup(String original)
	{
		//Constructor - converts the original word to lower case
		words = original.toLowerCase();
	}
	
	public String[] getWordArray()
	{
		//Split the words variable into separate words to be returned as a string array
		return words.split(" ");
	}
	
	public HashSet<String> getWordSet(WordGroup wordGroup)
	{
		//Create a hash set from 2 word groups and return the hash set
		
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
	
	public HashMap<String, Integer> getWordCounts()
	{
		//Create a hash map of all the words linked to their word count in the sentence and return it
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		
		for (String word: this.getWordArray())
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
