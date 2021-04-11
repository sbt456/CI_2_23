class Friend{
	
	public Friend() {
		System.out.println("GM Sire, your constructor is here.");
		
	}
	
	public Friend(String able) {
		System.out.println("Second constructor present, your Grace.");
		this.name = name;
	}
	
	public Friend(String able, int cable) {
		System.out.println("Your Majesty, last constructor at your service!");
		this.name = name;
		this.age = age;
	}
	
	
	public void setName(String newName) {
		name = newName;
	}
	public void setAge(int newAge) {
		age = newAge;
	}
	
	public void setType(String newType) {
		type = newType;
	}
	
	public void setLocation(String newLocation) {
		location = newLocation;
	}
	
	
	private String name;
	private int age;
	private String location;
	private String type;
	
	void getData() {
		System.out.println("My best friend's name is " + name);
	
	}
	
	int calculateFidoAgeDifferrence() {
		int delta = 15 - age;
	    
	

	return delta;
	}
	
	int getAge() {
		return age;
	}
	
	String getName() {
		return name;
	}
	String getType() {
		return type;
	}
	
	String getLocation() {
		return location;
	}
	
	
	//2 constructors 
	//empty
	//all attributes
	//get name, age,type
	//set name, age, location
	
}
public class Pet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Friend friend1 = new Friend();
				
		//friend1.name = "Chewy";
		//friend1.age = 15;
		//friend1.type = "Shepherd";
		
		friend1.setName("Chewy");
		friend1.setAge(15);
		friend1.setType("Shepherd");
		friend1.setLocation("USA");
		
		friend1.getData();
		
		int years = friend1.calculateFidoAgeDifferrence();
		
		System.out.println("Fido is " + years + " years older.");
		
		int age = friend1.getAge();
		String name = friend1.getName();
		String type = friend1.getType();
		String location = friend1.getLocation();
		
		
		System.out.println("Name is: " + name);
		System.out.println("Age is: " + age);
		System.out.println("Type is: " + type);
		System.out.println("Location is: " + location);
		
	
		
		new Friend();
		new Friend("hello");
		new Friend("goodbye", 7);
		
		
		
	}

}
