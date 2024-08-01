package day_2024_08_01;

class Person {
	String name;
	int age;
	String address;	
	
	public void	person(String name, int age, String address) {
		this.name=name;
		this.age=age;
		this.address=address;
	}
}

class Student extends Person{
	String school;
	String major;
	int num1;
	public Student(String name, int age, String address, String school, String major, int num1) {
		super.address=address;
		super.age=age;
		super.name=name;
		this.major=major;
		this.num1=num1;
		this.school=school;
	}
	
	public void showInfo() {
		System.out.println("1학기 학점"+"->"+"3.37");
		System.out.println("2학기 학점"+"->"+"3.89");
		System.out.println("3학기 학점"+"->"+"4.35");
		System.out.println("4학기 학점"+"->"+"3.76");
		System.out.println("5학기 학점"+"->"+"3.89");
		System.out.println("6학기 학점"+"->"+"4.26");
		System.out.println("7학기 학점"+"->"+"4.89");
		System.out.println("8학기 학점"+"->"+"3.89");
	}
	
	public void average() {
		System.out.println("8학기 총 평균 평점은"+ "4.0375점입니다.");
	}
	
}



public class StudentMain {

	public static void main(String[] args) {
		
		Student stu = new Student("김다정", 20, "서울시", "동양서울대학교", "전산정보학과", 20132222);
        stu.showInfo();
        stu.average();

	}
}
