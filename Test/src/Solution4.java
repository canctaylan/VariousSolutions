

public class Solution4 {

    static boolean isAnagram(String a, String b) {
        // Complete the function
    	
        a = a.toLowerCase();
        b= b.toLowerCase();
        
        if(a.length()!=b.length())
        	return false;
        
        for(int i =0; i<a.length(); i++)
        {
        	
        	for(int j = 0; j<b.length(); j++)
        	{
        		if(a.charAt(i)==b.charAt(j))
        		{
        			b = b.substring(0,j) + b.substring(j+1);
        			break;
        		}
        	}
        }
        
        if (b.length()==0)
        	return true;
        else
        	return false;
    }

    public static void main(String[] args) {
    
        String a = "abcde";
        String b = "obcde";
        
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}