import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class InputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int i = sc.nextInt();
		System.out.println("입력된 정수는 " + i + "입니다.");
		sc.close();
		
		// 파일 읽어들이기
		File file = new File("input.txt");
		try {
			Scanner sc2  = new Scanner(file);
			while(sc2.hasNextInt()) {
				System.out.println(sc2.nextInt() * 100);
			}
			sc2.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일을 읽어오는 도중에 오류가 발생했습니다.");
		}
		
	}

}

