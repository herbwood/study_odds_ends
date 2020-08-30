
public class Statement {

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
		
	}

}
