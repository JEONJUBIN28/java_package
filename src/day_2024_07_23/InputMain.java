package day_2024_07_23;

import java.util.Scanner;

public class InputMain {

	public static void main(String[] args) {	
		//키보드
		//Scanner sc = new Scanner(System.in);//입력 기능을 가진 클래스
		
		while (true) {
			double radius;
			Scanner sc = new Scanner(System.in);
			
			System.out.print("원의 반지름을 입력하시오: ");
			radius=sc.nextDouble();
			
			Circle10 circle = new Circle10(radius);
			System.out.println("원의 넓이는"+ circle.getArea());
			System.out.println("==============");
		}
		
//		String str1 = sc.nextLine();//nextLine과 next의 차이는 띄어쓰기 단위로 값을 낸다.
//		
//		System.out.println(str1);
//		
//		String str2 = sc.next();
//		System.out.println(str2);
		
//		System.out.print("문자열 입력: ");W
//		String str1 = sc.nextLine();
//		
//		System.out.print("문자열 입력: ");
//		String str2 = sc.nextLine();
//		
//		System.out.print("국어:");
//		int kor = sc.nextInt();//제어권이 키보드로 넘어가 있음
//		
//		System.out.print("영어:");
//		int eng = sc.nextInt();
//		
//		System.out.print("수학:");
//		int math = sc.nextInt();
//		
//		System.out.print("double:");
//		double d = sc.nextDouble();
//		
//		System.out.printf("입력된 문자열 1: %s \n", str1);
//		System.out.printf("입력된 문자열 2: %s \n", str1);
//		
//				
//		System.out.println("국어:" + kor);
//		System.out.println("국어:" + kor);
//		System.out.println("영어:" +eng);
//		System.out.println("수학:" +math);
//		System.out.println("double:" + d);

	}

}
