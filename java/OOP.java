// Hero.java
//public class Hero {
//	String name;
//	
//	public void attack() {
//		System.out.println("주먹 지르기!");
//	}
//	
//	public Hero(String name) {
//		this.name = name;
//	}
//}

// Warrier.java
//public class Warrier extends Hero{
//
//	public Warrier(String name) {
//		super(name);
//		// TODO Auto-generated constructor stub
//	}
//	
//	public void groundCutting() {
//		System.out.println("대지 가르기!");
//	}
//	
//}

// Archer2.java

//public class Archer2 extends Hero{
//
//	public Archer2(String name) {
//		super(name);
//		// TODO Auto-generated constructor stub
//	}
//	
//	public void fireArrow() {
//		System.out.println("불화살!");
//	}
//
//}

// Wizard.java
//public class Wizard extends Hero{
//
//	public Wizard(String name) {
//		super(name);
//		// TODO Auto-generated constructor stub
//	}
//	
//	public void freezing() {
//		System.out.println("얼리기!");
//	}
//
//}

public class OOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hero[] heros = new Hero[3];
		heros[0] = new Warrier("전사");
		heros[1] = new Archer2("궁수");
		heros[2] = new Wizard("마법사");
		
		for (int i = 0; i < heros.length; i++) {
			heros[i].attack();
			
			if (heros[i] instanceof Warrier) {
				Warrier temp = (Warrier) heros[i];
				temp.groundCutting();
			}
			
			else if (heros[i] instanceof Archer2) {
				Archer2 temp = (Archer2) heros[i];
				temp.fireArrow();
			}
			
			else if (heros[i] instanceof Wizard) {
				Wizard temp = (Wizard) heros[i];
				temp.freezing();
			}
		}
	}

}
