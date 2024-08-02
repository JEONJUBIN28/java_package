package day_2024_08_01;

import java.util.Scanner;

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
	}
	
	public void average() {
	}
	
}



public class StudentMain {

	public static void main(String[] args) {
		Student stu = new Student("김다정", 20, "서울시", "동양서울대학교", "전산정보학과", 20132222);
        stu.showInfo();
        stu.average();
        
        final int COUNT = 8;
		double[] arrGrade=new double[COUNT];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("8학기 학점을 순서대로 입력하세요");
		double sum = 0;
		for(int i = 1; i<arrGrade.length;i++) {
			System.out.println(i+"학기 학점 ->");
			
			
			try {
				arrGrade[i]=sc.nextDouble();
				sum += arrGrade[i];
				
			}catch(Exception e){
				System.out.println("잘못된입력입니다. 다시 입력해 주세요.");
				i--;
				sc.nextLine();//한줄을 지우는것이기에 오류가 안난다.
				continue;
			}
			
		}
		
		System.out.println("총점 "+sum+" 평균 "+(sum/arrGrade.length));

	}
}
