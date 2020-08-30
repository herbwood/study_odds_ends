
public class Variable {
	
	final static double PI = 3.141592;
	final static int INT_MAX = 2147483647;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		
		// variable
		int intType = 100;
		double doubleType = 150.5;
		String stringType = "Kwon";
		
		System.out.println(intType);
		System.out.println(doubleType);
		System.out.println(stringType);
		
		// constant
		int r = 30;
		System.out.println(r * r * PI);
		
		// overflow
		int a = INT_MAX;
		System.out.println(a + 1);
		
		
		// calculator
		int x = 1;
		int y = 2;
		
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + (x * y));
		System.out.println("x / y = " + (x / y));
		
		
		// type change
		int z = (int) 0.5;
		System.out.println(z); // output : 0
		
		// type change example 
		double w = 0.5;
		int v =(int) (w + 0.5);
		System.out.println(v);
	}	

}
