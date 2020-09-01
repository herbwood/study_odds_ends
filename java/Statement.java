
public class Statement {
	
	final static int N=30;
	final static int A=15;
	public static void main(String[] args) {
		// 중복 연산자
		int i = 20;
		i += 1;
		System.out.println((100 < i) || (i < 200));
		
		// 조건문 기초
		String a = "I love you";
		if (a.contains("love"))
		{
			// 포함하는 경우 실행되는 부분
			System.out.println("Me too.");
		}
		else
		{
			// 포함하지 않는 경우 실행되는 부분
			System.out.println("I hate you");
		}
		
		
		// 점수에 따라 서로 다른 메시지 출력
		int score = 95;
		
		if (score >= 90)
		{
			System.out.println("A입니다");
		}
		else if (score >= 80)
		{
			System.out.println("B입니다");
		}
		else if (score >= 70)
		{
			System.out.println("C입니다");
		}
		else
		{
			System.out.println("F입니다");
		}
		
		
		String c = "Man";
		int b = 0;
		
		// 자바는 String은 비교할 때 equal()을 사용합니다
		// 그 이유는 String은 다른 자료형과 다른 문자열 자료형이기 때문입니다
		
		if (c.equals("Man"))
		{
			System.out.println("남자입니다");
		}
		
		else
		{
			System.out.println("남자가 아닙니다");
		}
		
		if(b==3)
		{
			System.out.println("b는 3입니다.");
		}
		
		else
		{
			System.out.println("3이 아닙니다.");
		}
		
		// String에서 대소문자 구분 X
		if (c.equalsIgnoreCase("man"))
		{
			System.out.println("참입니다");
		}
		
		// 연산자 활용하기
		if (c.equalsIgnoreCase("man") && b == 0)
		{
			System.out.println("참입니다");
		}
		else
		{
			System.out.println("거짓입니다");
		}
		
		
		// while문을 통해 1~1000까지의 합을 출력
		int num = 1, sum = 0;
		while (num <= 1000)
		{
			sum += num++;
		}
		System.out.println("1부터 1000까지의 합은 " + sum + "입니다");
		
		
		// for문을 사용하여 삼각형을 출력
		for (int z=N; z > 0; z--)
		{
			for (int j=z; j > 0; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// for문을 통해 원을 출력하기
		for (int q=-A; q <= A; q++)
		{
			for (int w=-A; w <= A; w++)
			{
				if (q * q + w * w < A * A)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

