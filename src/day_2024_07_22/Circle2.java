package day_2024_07_22; //물리적 폴더


//A 회사 에서 만들어준 클래스
public class Circle2 {
	private double rad;
	final double PI ;
	
	public Circle2(double r){
		this.rad = r;
		PI = 3.14;
	}
	
	public double getArea() {
		return rad * rad * PI;
	}
	
}
