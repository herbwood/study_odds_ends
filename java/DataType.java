
public class DataType {

	public static void main(String[] args) {
		// double
		double a = 10.3;
		double b = 9.6;
		double c = 10.1;
		
		System.out.println((a + b + c) / 3);
		
		// Character
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i +" ");
		} 

		// 8, 16진수
		int x = 200;
		
		System.out.println("10진수 : " + x);
		System.out.format("8진수 : %o\n", x);
		System.out.format("16진수 : %x", x);
		
		// String
		
		String name = "June Kwon";
		System.out.println(name);
		System.out.println(name.substring(0, 1));
		System.out.println(name.substring(3, 6));
		System.out.println(name.substring(0, 4));
		
	}

}
