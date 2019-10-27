import java.util.ArrayList;
import java.util.Arrays;

public class WordsInASentence {
	
	public static void main(String[] args) {
		boolean result = false;
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("Can is studying Java");
		arr.add("Serra is studying art history");
		
		for(String var : arr)
		{
			result = isSentenceOnlyContainWords("Can is studying Java", var);
			System.out.println(var+" sentence contains only these words: "+result);
		}
		
	}
	
	public static boolean isSentenceOnlyContainWords(String givenWords, String sentence)
	{
		String[] sentenceParts = null;
		String[] wordParts = null;
		ArrayList<String> sentenceList = null;
		
		sentenceParts = sentence.split(" ");
		wordParts = givenWords.split(" ");
		sentenceList = new ArrayList<String>(Arrays.asList(sentenceParts));
		
		if(wordParts.length != sentenceParts.length)
			return false;
		else
		{
			for(int i=0;i<wordParts.length;i++)
			{
				for (int j=0;j<sentenceList.size();j++)
				{
					if(wordParts[i].equals(sentenceList.get(j)))
						sentenceList.remove(j);
				}
			}
			
			if(sentenceList.size()>0)
				return false;
			else
				return true;
		}
	}

}
