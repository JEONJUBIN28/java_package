package day_2024_07_29;

import java.util.Arrays;



class A {
	public A() {
		System.out.println("A생성자");
	}
}

class B extends A {
	public B() {
		// super();
		System.out.println("B생성자");
	}
}

class Man {
	String name;

	// public Man() {}

	public Man(String name) {
		this.name = name;
	}

	public void tellYourName() {
		System.out.println("My name is " + name);
	}
}


class BusinessMan extends Man {
	String company;
	String position;

	public BusinessMan(String name, String company, String position) {
		// 부모의 생성자를 호출함
		super(name);// 상속 받을때 자식생성자 위에 부모생성자 하나가 꼭 호출되야한다.

		// this.name=name;
		// super.name=name; 부모에 있는 생성자를 호출해오는것이다.

		this.company = company;
		this.position = position;
	}

	public void tellYourInfo() {
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
		super.tellYourName();
	}

}

public class BusinessManMain {

	public static void main(String[] args) {
		

		new B();

		BusinessMan businessMan = new BusinessMan("홍길동", "홍길동컴퍼니", "staff");
		businessMan.tellYourInfo();
	}
}
