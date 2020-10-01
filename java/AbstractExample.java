// 추상 클래스를 사용함으로써 반드시 구현해야 하는 메서드를 지정받음
// 설계적인 측면에서 의의가 있음

// Player.java
//abstract class Player {
//	abstract void play(String songname);
//	abstract void pause();
//	abstract void stop();
//}

public class AbstractExample extends Player{
	
	public static void main(String[] args) {
		
		AbstractExample main = new AbstractExample();
		main.play("JoaKim Karud - Mighty Love");
		main.pause();
		main.stop();
	}

	@Override
	void play(String songname) {
		// TODO Auto-generated method stub
		
		System.out.println(songname + " 곡을 재생합니다.");
		
	}

	@Override
	void pause() {
		// TODO Auto-generated method stub
		System.out.println("곡을 일시정지합니다.");
		
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("곡을 정지합니다.");
		
	}
}
