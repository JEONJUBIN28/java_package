package day_2024_07_23;

import java.util.Scanner;

class Circle10 {
	private double rad;

	public Circle10(double r) {
		this.rad = r;
	}

	public double getArea() {
		return rad * rad * Math.PI;
	}
}

class Rectangle2{
	private double width;
	private double height;
	
	public Rectangle2(double width, double height) {
		this.width=width;
		this.height=height;
	}
	public double Area() {
		return width*height;
	}
}

public class RectangleInputMain {

	public static void main(String[] args) {

		while (true) {
			double radius;
			Scanner sc = new Scanner(System.in);
			
			System.out.print("가로: ");
			double width=sc.nextDouble();
			
			System.out.print("세로: ");
			double height=sc.nextDouble();
			
			Rectangle2 rectangle2 = new Rectangle2(width, height);
			
			System.out.println("원의 넓이는: "+ rectangle2.Area());
			
			String yesOrNo=sc.next();
			
			if(yesOrNo.equals("Y")||yesOrNo.equals("y")) {
				continue;
			}else {
				break;
			}
			
			
			
//			System.out.print("원의 반지름을 입력하시오: ");
//			radius=sc.nextDouble();
//			
//			Circle10 circle = new Circle10(radius);
//			System.out.println("원의 넓이는"+ circle.getArea());
//			System.out.printf("계속하시겠습니까?y,n" +"\n");
//			System.out.println("========================");
//			
//			String yesOrNo=sc.next();
//			
//			if(yesOrNo.equals("Y")||yesOrNo.equals("y")) {
//				continue;
//			}else {
//				break;
//			}
			
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
