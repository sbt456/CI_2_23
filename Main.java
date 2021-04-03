import java.util.HashMap;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

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
