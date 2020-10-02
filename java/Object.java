// Java의 모든 클래스는 내부적으로 Object 클래스를 상속받고 있다
// 모든 클래스가 공통적으로 가져야할 속성을 정의함

public class Object {

	public static void main(String[] args) {
		
		Archer archer1 = new Archer("궁수1", "상");
		Archer archer2 = new Archer("궁수1", "상");
		System.out.println(archer1 == archer2);
		System.out.println(archer1.equals(archer2));

	}

}
