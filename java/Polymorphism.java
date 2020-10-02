import java.util.Scanner;

// 부모 클래스
//public class Fruit {
//	String name;
//	int price;
//	int fresh;
//	
//	public void show() {
//		System.out.println("이름 : " + name);
//		System.out.println("가격 : " + price);
//		System.out.println("신선도 : " + fresh);
//	}
//
//}
//
//// 자식 클래스(복숭아)
//public class Peach extends Fruit {
//	public Peach() {
//		price = 1500;
//		name = "복숭아";
//		fresh = 75;
//	}
//}

public class Banana extends Fruit {
	public Banana() {
		price = 1000;
		name = "바나나";
		fresh = 60;
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("바나나  1, 복숭아 2 ? ");
		int input = scanner.nextInt();
		Fruit fruit;
		if (input == 1) {
			fruit = new Banana();
			fruit.show();
		}
		else if (input == 2) {
			fruit = new Peach();
			fruit.show();
		}

	}

}
