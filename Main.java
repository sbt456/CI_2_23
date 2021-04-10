import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner scanner = new Scanner (System.in);

	    System.out.println("Welcome to High Interest Rate Honda! ");
	    
	    // String input
	  
	    System.out.println("Would you like to purchase a Honda? (yes or no)");
	    
	    String answer = scanner.nextLine();
	    
	    if(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")){
	     
	    	System.out.println("Hondas are nice vehicles ");
	 
	    }else {
	    	System.out.println("Currently we only have Hondas in stock.");
	    	
		
	    }
		
		
		    HashMap<String, String> cars = new HashMap<String, String>();
		    cars.put("Civic", "Honda");
		    cars.put("Accord", "Honda");
		    cars.put("Pilot", "Honda");
		    cars.put("Clarity", "Honda");
		    System.out.println(cars); 
		    for (String i : cars.keySet()) {
		  System.out.println("key: " + i + " value: " + cars.get(i));
		  }
		  }
		}
