package day_2024_07_26;

import java.util.Scanner;

class Rectangle3 {
	private double width, height;

	public Rectangle3(double width, double height) {
		this.height = height;
		this.width = width;
	}

	public double getArea() {
		return width * height;
	}

}


public class TestMain {

	public static void main(String[] args) {
		
		Rectangle3[] accRec = new Rectangle3[3];

		for (int i = 0; i < accRec.length; i++) {
			Scanner sc = new Scanner(System.in);

			System.out.println(i + "번쨰 사각형의 가로 세로를 넣으세요");

			System.out.print("가로");
			int width = sc.nextInt();

			System.out.print("세로");
			int heigth = sc.nextInt();
			accRec[i] = new Rectangle3(width, heigth);
		}
		double area = 0;

		for (int i = 0; i < accRec.length; i++) {
			area = area + accRec[i].getArea();
		}

		System.out.println("총넓이: " + area);

	
		
		
		
		

//		int[] acc = new int[5];
//		for (int i = 0; i < acc.length; i++) {
//			acc[i] = (int) ((Math.random() * 5));
//
//			System.out.print(acc[i] + " ");
//		}

//		char[] arr = new char [26];	
//		
//		for(int i =0;i<arr.length;i++) {
//			arr[i]=(char)(65+i);
//		}
//		
//		for(int i = 0; i<arr.length;i++) {
//			System.out.println(arr[i]+" ");
//		}
//		
//		System.out.println();

//		int[] acc = new int[10];
//
//		for (int i = 0; i < acc.length; i++) {
//			acc[i] = (int) ((Math.random() * 10));
//
//		}
//		System.out.print("랜덤한 정수들: ");
//
//		int sum = 0;
//		for (int i = 0; i < acc.length; i++) {
//			sum += acc[i];
//			System.out.print(acc[i] + " ");
//		}
//		System.out.println();
//
//		System.out.print("평균은 : " + sum / 3);

	}
}
