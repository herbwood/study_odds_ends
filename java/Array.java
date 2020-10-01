import java.util.Scanner;

public class Array {
	
	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ctrl + Shift + o
		Scanner scanner = new Scanner(System.in);
		System.out.print("생성할 배열의 크기를 입력하세요 : ");
		int number = scanner.nextInt();
		int[] array = new int[number];
		for (int i=0; i < number; i++) 
		{
			System.out.print("배열에 입력할 정수를 하나씩 입력하세요 : ");
			array[i] = scanner.nextInt();
		}
		int result = -1;
		for (int i =0; i < number; i++)
		{
			result = max(result, array[i]);
		}
		System.out.println("입력한 모든 정수 중에서 가장 큰 값은 : " + result + "입니다.");
		
		
		// 100보다 작은 랜덤 정수의 평균
		int[] array2 = new int[100];
		for (int i=0; i<100; i++)
		{
			array2[i] = (int) (Math.random() * 100 + 1);
		}
		int sum = 0;
		for (int i=0; i<100; i++) 
		{
			sum += array2[i];
		}
		System.out.println("100개의 랜덤 정수의 평균 값은 " + sum/100 + "입니다.");
	}

}
