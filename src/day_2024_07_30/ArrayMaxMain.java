package day_2024_07_30;

//is-a 관계 VS has-a 관계 = 상속받는관계이다.

class Car {
	int wheel;

}

//is-a관계 ~은~이다 즉 확실하면 is-a이다.
class FireCar extends Car {

}

class Journey {

}

//has-a관계 애매하면 has-a이다.
class Life {
	Journey journey;
}

class MobilePhone {
	protected String number; // 전화번호

	public MobilePhone(String num) {
		number = num;
	}

	public void answer() {
		System.out.println("hi~ from " + number);
	}
}

class SmartPhone extends MobilePhone {
	private String androidVer; // 안드로이드 운영체제 네임(버전)

	public SmartPhone(String num, String ver) {
		super(num);
		androidVer = ver;
	}

	public void playApp() {
		System.out.println("App is running in " + androidVer);
	}
}

class Cake{
	public void yummy() {
		System.out.println("Yummy Cake");
	}
}

class CheeseCake extends Cake{
	public void yummy() {
		System.out.println("Yummy CheeseCake Cake");
	}
}
/*
*함수오버라이딩 = 상속 관계에서 이름 같은 함수(함수 바디만 달리하는것)가
*있을대 자식 함수로 부모함수를 덮어 쓰느것(주소 바꿔치기)
*
*오버라이딩은 자식꺼
*몰리몰피즘 + 오버라이딩 = 자바의 70%;
*/
public class ArrayMaxMain {

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone("010-555-777", "Nougat");
		phone.answer(); // 전화를 받는다.
		phone.playApp(); // 앱을 선택하고 실행한다.

		// 중요! 다형성(polymorphizm) = 폴리몰피즘(부모=자식)
		MobilePhone ph2 = new SmartPhone("010-999-333", "Nougat");
		//SmartPhone ph3 = new MobilePhone("010-999-333", "Nougat");
		
		//public void println(Object x = phone)
		System.out.println(phone);
		
		ph2.answer();
		// ph2.playApp(); //메모리에 올라가있지 않기에 실행안됨.
		
		Cake c1 = new CheeseCake();
		CheeseCake c2 = new CheeseCake();
		
		c1.yummy();
		c2.yummy();

	}
}
