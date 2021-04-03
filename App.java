import java.util.HashMap;
import java.util.Scanner;

public class App {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myObj = new Scanner(System.in);

	    System.out.println("Enter your name, the car model you are searching for and 5 numbers");

	    // String input
	    String name = myObj.nextLine();
	    String car = myObj.nextLine();


	    // Numerical input
	    int num1 = myObj.nextInt();
	    int num2 = myObj.nextInt();
	    int num3 = myObj.nextInt();
	    int num4 = myObj.nextInt();
	    int num5 = myObj.nextInt();
	    
	    System.out.println("Currently there are no " +  (car + "s in stock. "));

 /*if (car == "yes" ) {
	    	
	    	System.out.println("That's a nice Honda, this is our current selection ");
	    	
	    	  
	    	 } else if (car == "hrv") {
	    		 System.out.println("That Hondas is nice, however it's not in our current selection ");
	    		 
	    		 
	    	 } else if (car == "yugo") {
	    		 System.out.println("Really? I'm sure there are other vehicles you may enjoy ");
	    		 
	    	 } else {
	    		 
	    			System.out.println("Currently that vehicle is not in stock. ");
	    		}*/
	    	

	    // Output input by user
	    System.out.println("Excellent selection of numbers " + name); 
	    System.out.println("Sum= " + (num1+num2+num3+num4+num5)); 
	    System.out.println("Product= " + (num1*num2*num3*num4*num5));
	    
	    
	 
	    		
	    if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5 ) {
	    	
	    	System.out.println("Largest number: " + num1);
	    	  
	    	 } else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
	    		 System.out.println("Largest number: " + num2);
	    		 
	    	 } else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
	    		 System.out.println("Largest number: " + num3);
	    		 
	    	 } else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
	    		 System.out.println("Largest number: " + num4);
	    		 
	    		} else {
	    			System.out.println("Largest number: " + num5);
	    		}
	    	
	    
      if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5 ) {
	    	
	    	System.out.println("Smallest number: " + num1);
	    	  
	    	 } else if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5) {
	    		 System.out.println("Smallest number: " + num2);
	    		 
	    	 } else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
	    		 System.out.println("Smallest number: " + num3);
	    		 
	    	 } else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
	    		 System.out.println("Smallestt number: " + num4);
	    		 
	    		} else {
	    			System.out.println("Smallest number: " + num5);
	    		}
	    	
	    
	    
	    
      
	    
	    
	    
	    
		/*int value = 7;
		int[] values;
		
		values = new int[3];
		
		System.out.println(values[0]);
		
		values[0]=10;
		values[0]=20;
		values[0]=30;
				
		
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		
		
				
		int [] numbers = {5,6,7};
	
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]); 
			}*/
			
     
      
      
      
      
      
      
		}
		
	

	}
	

