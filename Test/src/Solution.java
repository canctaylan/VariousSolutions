import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double payment = scanner.nextDouble();
//        scanner.close();
    	
    	double payment = 998763.999;
        
        // Write your code here.
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        nf = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat nf1 = NumberFormat.getCurrencyInstance();
        nf1 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat nf2 = NumberFormat.getCurrencyInstance();
        nf2 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        String us = nf.format(payment);
        String india = getIndianCurrency(payment);
        String china = nf1.format(payment);
        String france = nf2.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
    
    private static String getIndianCurrency(double payment)
    {
    	String res=String.format("%.2f",payment);
    	String[] parts = res.split("\\.");
    	String left = parts[0];
    	left = reverse(left);
    	left = left.replaceAll("(.{3})", "$1,");
    	left = reverse(left);
    	if(left.startsWith(","))
    		left=left.substring(1);
    	
    	if(1 > Math.pow(2, 3))
    	res = "Rs."+left+"."+parts[1];
    	
    	
    	return res;
    }
    
    private static String reverse(String s)
    {
    	String rev = "";
    	
    	for(int i = s.length()-1; i>=0;i--)
    	{
    		rev += s.charAt(i);
    	}
    	
    	return rev;
    }
}
