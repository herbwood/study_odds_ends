// 부모 클래스
//public class Person {
//	
//	private String name;
//	private int age;
//	private int height;
//	private int weight;
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() { 
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public int getHeight() {
//		return height;
//	}
//	public void setHeight(int height) {
//		this.height = height;
//	}
//	public int getWeight() {
//		return weight;
//	}
//	public void setWeight(int weight) {
//		this.weight = weight;
//	}
//	
//	public Person(String name, int age, int height, int weight) {
//		super(); // 자신의 부모 클래스의 생성자를 실행하겠다는 뜻
//		this.name = name;
//		this.age = age;
//		this.height = height;
//		this.weight = weight;
//	}
//	
//	
//	
//}


public class Student extends Person {
	
	private String studentId;
	private int grade;
	private double GPA;
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	public Student(String name, int age, int height, int weight, String studentId, int grade, double gPA) {
		super(name, age, height, weight); // 부모의 생성자를 사용함
		this.studentId = studentId;
		this.grade = grade;
		GPA = gPA;
	}
	
	public void show() {
		System.out.println("---------------------");
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(getHeight());
		System.out.println(getWeight());
		System.out.println(getStudentId());
		System.out.println(getGrade());
		System.out.println(getGPA());

	}
	
}

//public class Main {
//	public static void Main(String[] args) {
//		
//		Student student1 = new Student("홍길동", 20, 175, 60, "201311123", 1, 4.5);
//		Student student2 = new Student("이순신", 23, 189, 80, "234234223", 4, 3.6);
//		
//		student1.show();
//		student2.show();
//	}
//
//}


