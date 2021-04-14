/**
 * 
 */
/**
 * @author Taman
 *
 */
package conditionals;

import java.util.Random;
import java.util.Scanner;

public class AsciiChars {
	
	
	
		public static void printNumbers() {
		
		    // TODO: print valid numeric input
		
			for(int i=48; i < 58; i++ ) {
				char numbers = (char) i;
				System.out.println(numbers);
			}

		}	
	
		public static void printLowerCase() {
			
		    // TODO: print valid numeric input
		
			for(int i=97; i <= 122; i++ ) {
				char lowCase = (char) i;
				System.out.println(lowCase);
			}

		}	
		
		public static void printUpperCase() {
			
		    // TODO: print valid numeric input
		
			for(int i=65; i <= 90; i++ ) {
				char upCase = (char) i;
				System.out.println(upCase);
			}

		}	





 	public static void main(String[] args) {
 		AsciiChars.printNumbers();
 		AsciiChars.printUpperCase();
 		AsciiChars.printLowerCase();
 		String continueAnswer;
 		
 		


	Scanner scanner = new Scanner (System.in);

    System.out.println("What is your name?");

    // String input
    String name = scanner.nextLine();
    System.out.println(name + ", would you like to continue? (yes or no)");
    String answer = scanner.nextLine();
    
    if(answer.equalsIgnoreCase("yes")){
    	do {
    			System.out.println("Do you have a red car? (yes,no): ");
    			String car = scanner.nextLine();
    
    			System.out.println("What is the name of your fav pet? ");
    			String petName = scanner.nextLine();
    	
    			System.out.println("How old is " + petName + " ?");
    			int age = scanner.nextInt();
    	
    			System.out.println("What is your lucky number? ");
    			int luckyNumber = scanner.nextInt();
    	
    			System.out.println("Do you have a fav QB? ");
    			String quarterBack = scanner.nextLine();
    	
    			int jerseyNumber = 0;
    	
    			if(quarterBack.equalsIgnoreCase("y") || quarterBack.equalsIgnoreCase("yes")) {
    		
    			System.out.println("What's the QB's jersey number? ");	
    			jerseyNumber = scanner.nextInt();
    	}
    
    			System.out.println("What is the two digit year of your car? ");
    			int year = scanner.nextInt();
    			scanner.nextLine();
    	
    			System.out.println("Who is your fav actor or actress? ");
    			String favorite = scanner.nextLine();
    	
    			System.out.println("Enter a random number between 1 and 50: ");
    			int randNumber = scanner.nextInt();
    			scanner.nextLine();
    	
    			Random rand = new Random();
    	
    			int magicBallNumber;
    	
    			//3 randoms
    			int rand1 = rand.nextInt(50);
    			int rand2 = rand.nextInt(50);
    			int rand3 = rand.nextInt(50);
   
  
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	if(quarterBack.equalsIgnoreCase("y")||quarterBack.equalsIgnoreCase("yes")){
 		magicBallNumber = jerseyNumber * rand1;
 	}else{
 		magicBallNumber = luckyNumber * rand1;
 	}
    if(magicBallNumber > 75) {
    	magicBallNumber -= 75;
    }
    
    int number1;
    int number2;
    int number3;
    int number4;
    int number5;
    
    number1 = year + luckyNumber;
    if(number1 > 65) {
    	number1 -= 65;
    }
    if(number1 < 1) {
    	number1 += 65;
    }
    number2 = rand2 - rand.nextInt(50);
    if(number2 > 65) {
    	number2 -= 65;
    }
    if(number2 < 1) {
    	number2 += 65;
    }
    number3 = 42;
    
    number4 = age + year;
    if(number4 > 65) {
    	number1 -= 65;
    }
    if(number4 < 1) {
    	number1 += 65;
    }
    number5 = (int) favorite.charAt(0);
    		 if(number5 > 65) {
    		    	number5 -= 65;
    		    }
    if(number5 < 1) {
    	number5 -= 65;
    }
    if(number5 < 1) {
    	number5 += 65;
    }
    
    System.out.print("\nLottery numbers : ");
    System.out.print(number1+", ");
    System.out.print(number2+", ");
    System.out.print(number3+", ");
    System.out.print(number4+", ");
    System.out.print(number5+", ");
    System.out.print(" Magic ball: " + magicBallNumber);
    
    
    System.out.println("\nWould you like to get another set of numbers? (yes, no)");
    continueAnswer = scanner.next();
}while (continueAnswer.equalsIgnoreCase("y") || continueAnswer.equalsIgnoreCase("yes"));

}else {
	System.out.println("Please complete the survey at another time");
}
System.out.println();
scanner.close();
    
	
    
    
    
    
    }
    }
    

 	
 	
 	
 	
 	
 	
 	
 	