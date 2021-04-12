class Toy{
	
	public Toy() {	
		System.out.println("Classic model: " + classic);
		
	}
	
	public Toy(String able , String mable) {
		System.out.println("Sally Carrera (Porsche)");
		this.name = name;
		this.make = make;
	}
	
	public Toy(String able, String mable, int cable) {
		System.out.println("Girlfriend :");
		this.name = name;
		this.model = model;
		this.year = year;
	}
	
	
	public void setName(String newName) {
		name = newName;
	}
	public void setYear(int newYear) {
		year = newYear;
	}
	
	public void setMake(String newMake) {
		make = newMake;
	}
	
	public void setModel(String newModel) {
	    model = newModel;
	}
	
	public void setClassic(boolean newClassic) {
	    classic = newClassic;
	}
	
	
	private String name;
	private int year;
	private String model;
	private String make;
	private boolean classic;
	
	void getData() {
		System.out.println("My best friend's name is " + name);
	
	}
	
	int calculateAge() {
		int age = 2021 - year;
	    
	

	return age;
	}
	
	int getYear() {
		return year;
	}
	
	String getName() {
		return name;
	}
	String getMake() {
		return make;
	}
	
	String getModel() {
		return model;
	}
	
	
	
	





}

public class Car {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Minimum 3 private instance variables make model year name
		An empty constructor
		A constructor that uses only 2 of your 3 variables
		A constructor that uses all 3 of your instance variables
		Get methods for all 3 of your instance variables
		Set methods for all 3 of your instance variables
		A method that returns a Boolean
		A method that returns a String*/
		
		
	
		Toy toy1 = new Toy();
		
		toy1.setName("Lightning McQueen");
		toy1.setYear(2006);
		toy1.setMake("Chevy");
		toy1.setModel("Corvette");
		toy1.setClassic(false);
		
		//friend1.getData();
		
		//int year = friend1.calculateFidoAgeDifferrence();
		
		//System.out.println("Fido is " + year + " years older.");
		
		int year = toy1.getYear();
		String name = toy1.getName();
		String make = toy1.getMake();
		String model = toy1.getModel();
		
		
		
		System.out.println("Name is: " + name);
		System.out.println("Year is: " + year);
		System.out.println("Make is: " + make);
		System.out.println("Model is: " + model );
		
	
		
		//new Toy();
		new Toy("hello","goodbye", 7);
		new Toy("goodbye", "hello"); 
		
		
		
		
	}

}
		
		
	


