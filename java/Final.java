final class Parent {
	public final void show() {
		System.out.println("hi");
	}
}

// 클래스 앞에 final이 붙으면 상속이 불가능함
public class Final extends Parent{
	public static void main(String[] args) {
//		final int number = 10;
//		System.out.println(number);
		Final main = new Final();
		main.show();
	}
	
	
	// Parent 클래스에서 show 메서드에 final이 붙었기 때문에
	// 상속받았음에도 바꾸지 못한다. 
	public void show() {
		System.out.println("Hello");
	}
}
