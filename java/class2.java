public class class2 {
	
	// 외부에서 볼 수 없는 private 변수
	private int x;
	private int y;
	
	// private 변수인 x를 가져올 수 있게 만들어주느 메서드
	public int getX() {
		return x;
	}
	
	// 현재 x의 값을 인자로 받은 값으로 바꿔주는 메서드
	public void setX(int x) {
		this.x = x;
	}
	
	// private 변수인 x를 가져올 수 있게 만들어주느 메서드
	public int getY() {
		return y;
	}
	
	// 현재 x의 값을 인자로 받은 값으로 바꿔주는 메서드
	public void setX(int y) {
		this.y = y;
	}
	
	// 생성자
	public class2(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	public class2 getCenter(class2 other) {
		return new class2((this.x + other.getX()) / 2, (this.y + other.getY()) / 2);
	}
}