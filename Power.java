
public class Power {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] size = {0,1,2,3};
		
		int [][] toPower = {
				{0,1,2,3},
				{2}
		};
				
		System.out.println(toPower[0][0]);
		System.out.println(toPower[0][1]);
		System.out.println(toPower[0][2]);
		System.out.println(toPower[0][3]);
		
		
		System.out.println(toPower[0][3]*toPower[0][3]);
		System.out.println(toPower[0][2]*toPower[0][2]);
		System.out.println(toPower[0][1]*toPower[0][1]);
		System.out.println(toPower[0][0]*toPower[0][0]);
		
		int a = 0;
		int b = 1;
		int c = 2;
		int d = 3;
		int e = 2;
		
		System.out.println("+++++++++++++++");
		
		System.out.println(Math.pow(a, e));
		System.out.println(Math.pow(b, e));
		System.out.println(Math.pow(c, e));
		System.out.println(Math.pow(d, e));
				

				
	}

}
