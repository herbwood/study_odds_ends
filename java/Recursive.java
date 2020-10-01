
public class Recursive {
	
	// 반복문
	public static int factorial(int number) {
		int sum = 1;
		for (int i=2; i <= number; i++)
		{
			sum *= i;
		}
		return sum;
	}
	
	// 재귀함수
	public static int factorial2(int number) {
		if (number == 1)
			return 1;
		else
			return number * factorial2(number - 1);
	}
	
	public static int fibonacci(int number) {
		int one = 1;
		int two = 1;
		int result = -1;
		if (number <= 1)
			return one;
		else
		{
			for (int i=2; i < number; i++)
			{
				result = one + two;
				one = two;
				two = result;
			}
		}
		return result;
	}
	
	public static int fibonacci2(int number) {
		if (number <= 2)
			return 1;
		else
		{
			return fibonacci2(number - 1) + fibonacci2(number - 2);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("10 팩토리얼은 " + factorial2(10));
		System.out.println("피보나치 수열의 10번째 원소는 " + fibonacci2(10));
	}	

}
