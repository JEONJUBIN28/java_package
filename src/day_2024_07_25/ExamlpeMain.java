package day_2024_07_25;

//C언어는 같은 함수이름 사용 불가
//똑같은 함수이름을 쓸수있는 조건 - 파라미터(매개변수) 타입또는 갯수를 다르게함 = 함수 오버로딩
//함수 오버로딩 = 같은함수이름으로 파라미터 타입또는 갯수를 달리하는것.
//대표적인 함수 오버로딩 함수는 println()함수입니다.
//8. immutable  이란 => 원형 보존의 법칙 = 스트링은 final 이다
//9. 잊지말자 6.25 -> 잊지말자  equals ;
class OverloadingEx {

	public void function() {
		System.out.println("함수");
	}

	public void function(int num) {
		System.out.println(num);
	}

//	public int function(int num) { //리턴타입(반환형)은 함수오버로딩과 전혀 상관이 없다.
//		System.out.println(num);
//		return 0;
//	}

	public void function(double num) {
		System.out.println(num);
	}

	public void function(int num, int num2) {
		System.out.println(num);
	}

}

class Person {
	private int regiNum;
	private int passNum;

	public Person(int rnum, int pnum) {
		regiNum = rnum;
		regiNum = pnum;
	}

	public Person(int rnum) {
		// regiNum = rnum;
		// regiNum = 0;
		this(rnum, 0);
	}

	void showPersonalInfo() {
		System.out.println("주민등록번호:" + regiNum);

		if (passNum != 0)
			System.out.println("여권번호 :" + passNum);
		else
			System.out.println("여권을 가지고 있지 않습니다.\n");
	}
}

public class ExamlpeMain {

	public static void main(String[] args) {
		
		StringBuilder stbuf = new StringBuilder("123");
		
		stbuf.append(45678);
		System.out.println(stbuf.toString());
		
		stbuf.delete(0, 2);
		System.out.println(stbuf.toString());
		
		stbuf.replace(0, 3, "AB");
		System.out.println(stbuf.toString());
		
		stbuf.reverse();
		System.out.println(stbuf.toString());
		
		String sub = stbuf.substring(2, 4);
		System.out.println(sub);
		
		//
		// "abcdefg100"
		String st5 = "abcdefg" + "100" + '양' + 1;

		//for (int i = 0; i < 5000000; i++)
			//st5 = st5 + "A";

		System.out.println(st5);

		String st6 = st5.substring(2);
		System.out.println(st6);

		String st7 = st5.substring(2, 4);
		System.out.println(st7);

		String st1 = "Lexicographically";
		String st2 = "lexicographically";
		int cmp;

		if (st1.equals(st2))
			System.out.println("두 문자열은 같습니다.");
		else
			System.out.println("두 문자열은 다릅니다.");

		// compareTo는 사전의 순서에 따라서 그값을 갖고 비교.
		cmp = st1.compareTo(st2);
		if (cmp == 0)
			System.out.println("두 문자열은 일치합니다.");
		else if (cmp < 0)
			System.out.println("사전의 앞에 위치하는 문자: " + st1);
		else
			System.out.println("사전의 앞에 위치하는 문자: " + st2);

		if (st1.compareToIgnoreCase(st2) == 0)
			System.out.println("두 문자열은 같습니다.");
		else
			System.out.println("두 문자열은 다릅니다.");

//		String st1 = "Coffee";
//		String st2 = "Bread";
//
//		String st3 = st1.concat(st2);
//		System.out.println(st3);
//
//		String st4 = "Fresh".concat(st3);
//		System.out.println(st4);

		// 1.7버전부터 가능.
//		int num = 1;
//		String str = "Spring";
//
//		// switch는 정수로 구분하기에 정수만 올수있다.
//		switch (str) {
//		case "Spring":
//			System.out.println("봄입니다.");
//		}
//
//		switch (num) {
//		case 1:
//		case 2:
//		case 3:
//			System.out.println("봄입니다.");
//		}
//
//		// 1.7버전부터 가능.
//		switch (num) {
//		case 1, 2, 3:
//			System.out.println("봄입니다.");
//		}
//
//		String str1 = "Simple String"; // ""머리에 먼저 한번 올려서 공유한다.
//		String str2 = "Simple String";// 단, 대소문자 하나라도 틀리면 따로 머리에 올리기에 같아야한다.
//
//		String str3 = new String("Simple String");// new는 허리에 따로 방을 잡는다.
//		String str4 = new String("Simple String");
//
//		if (str1 == str2)// ==는 주소를 비교하는것이다.
//			System.out.println("str1가 str2는 동일 인스턴스 참조");
//		else
//			System.out.println("str1가 str2는 다른 인스턴스 참조");
//
//		if (str3 == str4)// 자바스크립트 나 파이썬 등 다른언어에서는 == 는 문자열 비교
//			System.out.println("str3가 str4는 동일 인스턴스 참조");
//		else
//			System.out.println("str3가 str4는 다른 인스턴스 참조");
//
//		// 안에 있는 문자열 비교
//		if (str1.equals(str3))
//			System.out.println("안에 있는 글자가 같습니다.");
//		else
//			System.out.println("글자가 다릅니다.");

//		OverloadingEx ex = new OverloadingEx();
//		ex.function();
//		ex.function(10);
//
//		// 여권 있는 사람의 정보를 담은 인스턴스 생성
//		Person jung = new Person(335577, 112233);
//
//		// 여권 없는 사람의 정보를 담은 인스턴스 생성
//		Person hong = new Person(775544);
//
//		jung.showPersonalInfo();
//		hong.showPersonalInfo();
	}
}
