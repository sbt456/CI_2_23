
public class HelloWorld {

	public static void main(String[] args) {
		
	
	System.out.println("Hello world!");
	int sum = 0;
	/*int product = 1;*/
	int intList[] = {0,1,2,3,4,5,6,7,$,9};
	for (int i = 0; i < intList.length; i+=2) {
		sum += intList[i]; 
	} System.out.println(sum);
	for (int i = 1; i < intList.length; i+=2) {
		product *= intList[i]; 
	} System.out.println(product);
	System.out.println(1*3*5*7*9);
	}
