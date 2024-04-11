package studio9;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import support.cse131.NotYetImplementedException;

public class WordCount {
	
	/**
	 * Constructs and returns a map of the distinct words in the specified list with
	 * each word associated with its accumulated count (that is: the number of
	 * occurrences of the word in the list).
	 * 
	 * For example, if passed a List<String> containing:
	 * 
	 * [to, be, or, not, to, be]
	 * 
	 * the resulting Map<String, Integer> would contain
	 * 
	 * key="to", value=2;
	 * key="be", value=2;
	 * key="or", value=1;
	 * key="not", value=1;
	 * 
	 * @param words
	 * @return a map which contains all of the distinct words as keys, each
	 *         associated with the number of occurrences of the word
	 */
	public static Map<String, Integer> countWords(List<String> words) {
		Map<String, Integer> countWords = new HashMap<>();
		/*for (int i = 0; i < words.size(); i++) {
			//for (int j = 0; i < words.size(); j++) {
				if (countWords.get(i) == null) {
					countWords.put(words.get(i), 1);
				}
				else //(words.get(j)==words.get(i)) 
					{
					int num = countWords.get(words.get(i)); 
					countWords.put(words.get(i),num+1);
				}
			//}
			}
		return countWords; 
		*/
		for (String word : words) {
			if (countWords.get(word) == null) {
				countWords.put(word, 1);
			}else {
				int num = countWords.get(word); 
				countWords.put(word,num+1);

			}
		}return countWords;

	} 
	
	public static void main(String[] args) {
		
		List<String> wordList = new LinkedList<>();
		wordList.add("to");
		wordList.add("be");
		wordList.add("or");
		wordList.add("not");
		wordList.add("to");
		wordList.add("be");
		Map<String, Integer> words = countWords(wordList);
		for (String word : words.keySet()) {
			System.out.println(word+ ": " + words.get(word));
		}

		
		//TODO: Write code that will iterate over the words map
		//to verify its contents
	}
}
