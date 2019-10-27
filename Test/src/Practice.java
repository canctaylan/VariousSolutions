// https://wealthsimple.quip.com/Y2GoA0kcwLlM/Position-Calculator-Candidate-Description

import java.util.*;

class Activity {
  public String date;
  public String type;
  public String symbol;
  public String country;
  public int quantity;
  public double net_amount;

  public Activity(String date, String type, String symbol, String country, int quantity, double net_amount) {
    this.date = date;
    this.type = type;
    this.symbol = symbol;
    this.country = country;
    this.quantity = quantity;
    this.net_amount = net_amount;
  }
  
  public String toString() {
    return String.format("%s, %s, %s, %s, %s, %s", date, type, symbol, country, quantity, net_amount);
  }
}

class Activities {

  public static List<Activity> VALUES = new ArrayList<>();

  static {
    VALUES.add(new Activity("2015-01-28", "DEP", null, null, 0, 200.0));
    VALUES.add(new Activity("2015-03-01", "WDL", null, null, 0, -50.0));
    VALUES.add(new Activity("2015-02-26", "BUY", "ACB", "CA", 3, -70.0));
    VALUES.add(new Activity("2015-02-27", "SELL", "ACB", "CA", -1, 60.0));
    VALUES.add(new Activity("2015-02-26", "BUY", "ACB", "US", 4, -80.0));
    VALUES.add(new Activity("2015-02-27", "SELL", "ACB", "US", -3, 20.0));
  }
}

class Practice {
  public static void main(String[] args) {
    for (Activity activity : Activities.VALUES) {
      
    	HashMap<String, Integer> hash_map = new HashMap<String, Integer>();
    	
    	
    	hash_map.replace("Cash",(int) (hash_map.get("Cash")+activity.net_amount));
      
      System.out.println(activity);
    }
    
    /* Write your solution here */

    /* Desired output:
      ACB-CA: 2 share(s)
      ACB-US: 1 share(s)
      Cash: $80
    */
  }
}
