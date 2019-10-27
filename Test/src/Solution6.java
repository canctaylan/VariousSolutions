import java.util.regex.*;

public class Solution6
{
	public static void main(String[] args){
		int testCases = 3;
		while(testCases>0){
			String pattern = "batcatpat(nat";
          	//Write your code
			try {
			Pattern.compile(pattern);
			System.out.println("Valid");
			}
			catch(PatternSyntaxException ex)
			{
				System.out.println("Invalid");
			}
			testCases--;
		}
	}
}



