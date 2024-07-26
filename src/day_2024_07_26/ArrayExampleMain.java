package day_2024_07_26;

import java.util.Scanner;

class Box {
	private String conts;

	Box(String cont) {
		this.conts = cont;
	}

	public String toString() {
		return conts;
	}
}

class Circle5 {
	private double rad;

	public Circle5(double r) {
		this.rad = r;
	}

	public double getArea() {
		return rad * rad * Math.PI;
	}

}

class Rectangle2 {
	private double width, height;

	public Rectangle2(double width, double height) {
		this.height = height;
		this.width = width;
	}

	public double getArea() {
		return width * height;
	}

}


public class ArrayExampleMain {

	public static void main(String[] args) {

		{

			Rectangle2[] accRec = new Rectangle2[3];

			for (int i = 0; i < accRec.length; i++) {
				Scanner sc = new Scanner(System.in);

				System.out.println(i + "번쨰 사각형의 가로 세로를 넣으세요");

				System.out.print("가로");
				int width = sc.nextInt();

				System.out.print("세로");
				int heigth = sc.nextInt();
				accRec[i] = new Rectangle2(width, heigth);
			}

//			accRec[0] = new Rectangle2(10, 10);
//			accRec[1] = new Rectangle2(17, 89);
//			accRec[2] = new Rectangle2(90, 100);

			double area = 0;

			for (int i = 0; i < accRec.length; i++) {
				area = area + accRec[i].getArea();
			}

			System.out.println("총넓이: " + area);

		}
		
		
		Circle5[] arrCircle = new Circle5[3];

		for (int i = 0; i < arrCircle.length; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print(i + "번쨰" + "반지름을 넣으세요");
			arrCircle[i] = new Circle5(sc.nextInt());
		}
		//Circle5[] arrCircle = {new Circle5[10],new Circle5[8],new Circle5[7]};
		
//		arrCircle[0] = new Circle5(10);
//		arrCircle[1] = new Circle5(15);
//		arrCircle[2] = new Circle5(7);

		double area = 0;

		for (int i = 0; i < arrCircle.length; i++) {
			area = area + arrCircle[i].getArea();
		}
		System.out.println("총넓이:" + area);

//		String[] sr = new String[7];
//		sr[0] = new String("Java");
//		sr[1] = new String("System");
//		sr[2] = new String("Compiler");
//		sr[3] = new String("Park");
//		sr[4] = new String("Tree");
//		sr[5] = new String("Dinner");
//		sr[6] = new String("Brunch Cafe");
//
//		int cnum = 0;
//
//		for (int i = 0; i < sr.length; i++)
//			cnum += sr[i].length();
//
//		System.out.println("총 문자의 수: " + cnum);

//	Box[] ar = new Box[3];
//
//	// 배열에 인스턴스 저장
//	ar[0] = new Box("First");
//	ar[1] = new Box("Second");
//	ar[2] = new Box("Third");

		// 저장된 인스턴스의 참조
		// System.out.println(ar);
//	System.out.println(ar[0].toString());
//	System.out.println(ar[1]);
//	System.out.println(ar[2]);

//	int[] ar = new int[5];// int[](인트 배열)의 데이터 타입은 참조형(값은 주소가 온다)이다.
//	ar[0] = 1;
//	ar[1] = 2;
//	ar[2] = 3;
//	ar[3] = 4;
//	ar[4] = 5;
		// ar[5] = 5;

//	System.out.println(ar[0]);
//	System.out.println(ar[1]);
//	System.out.println(ar[2]);
//	System.out.println(ar[3]);
//	System.out.println(ar[4]);

//	for (int i = 0; i < ar.length; i++) {
//		ar[i] = i + 1;
//		System.out.println(ar[i]);
//	}

//	int[] ar1 = new int[5];
//
//	double[] ar2 = new double[7];
//
//	float[] ar3;
//	ar3 = new float[9];
//
//	System.out.println("배열 ar1 길이: " + ar1.length);
//	System.out.println("배열 ar2 길이: " + ar2.length);
//	System.out.println("배열 ar3 길이: " + ar3.length);

	}
}
