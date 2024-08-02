package day_2024_08_02;

import java.util.Scanner;

class Person {
	String name;
	int age;
	String address;

	Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	// getter, setter만들자..

	public void print() {
		System.out.println("이름 : "+ name);
		System.out.println("나이 : "+ age);
	}
}

class Student extends Person {
	String univ;
	String major;
	int studentNum;
	double[] grade = new double[8];

	Student(String name, int age, String address, String univ, String major, int studentNum) {
		super(name, age, address);
		this.univ = univ;
		this.major = major;
		this.studentNum = studentNum;
	}

//	@Override
	public void print() {
//		super.print();
		System.out.println();
		System.out.println("주소 : " + address);
		System.out.println("학교 : " + univ);
		System.out.println("학과 : " + major);
		System.out.println("학번 : " + studentNum);
	}

	public void setGrade() {
		Scanner sc = new Scanner(System.in);
		System.out.print("8학기 학점을 순서대로 입력하세요.");

		for (int i = 0; i <= grade.length - 1; i++) {
			System.out.println((i + 1) + "학기 학점  →  ");
			grade[i] = sc.nextDouble();
		}
		sc.close();
	}

	public double average() {
		double sum = 0.0;
		double avg = 0.0;

		for (int i = 0; i < grade.length; i++) {
			sum = sum + grade[i];
		}
		avg = sum / grade.length;
		return avg;
	}
}

public class StudentMain {

	public static void main(String[] args) {

		Student person = new Student("김다정", 20, "서울시 관악구", "동양서울대학교", "전산정보학과", 20132222);
		person.print();
		System.out.println();
		person.setGrade();

		System.out.println("8학기 총 평균 평점은" + person.average() + "점입니다.");

	}

}
