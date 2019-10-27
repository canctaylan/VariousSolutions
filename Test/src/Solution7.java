

class Solution7{

    public static void main(String[] args){
    	int a = 1;
        while(a>0){
            String IP = "123.123.123.123";
            System.out.println(IP.matches(new MyRegex().pattern));
            a--;
        }
        
    }
}

//Write your code here
class MyRegex
{

	public String pattern= "\\A(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\z";
    
}