
public class Operator {
	
	final static int SECOND = 1000;
	
	public static void main(String[] args) {
		
		// 시간 계산
		int minute = SECOND / 60;
		int second = SECOND % 60;
		
		System.out.println(minute + "분 " + second + "초");
		
		// 증감 연산자
		int a = 10;
		System.out.println("현재의 a는 " + a + "입니다.");
		a++;
		System.out.println("현재의 a는 " + a + "입니다.");
		System.out.println("현재의 a는 " + ++a + "입니다.");
		System.out.println("현재의 a는 " + a++ + "입니다.");
		System.out.println("현재의 a는 " + a + "입니다.");
		
		// %
		
		System.out.println(1 % 3);
		
		// 논리 연산자
		
		int x = 50;
		int y = 60;
		System.out.println(x == y);
		System.out.println(x >= y);
		System.out.println((x == y) && (x > y));
		
		// 삼항 연산자
		System.out.println(max(x, y));
		
		// pow 함수
		double w = Math.pow(3.0, 20);
		System.out.println((int) w);
		
	}
	// 반환형, 함수 이름, 매개 변수
	static int max(int a, int b) {
		int result = (a > b) ? a : b;
		return result;
	}

}
