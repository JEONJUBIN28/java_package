package day_2024_07_31;

interface Shape3{
	public void getArea();
}

class Circle5 implements Shape3{
	public double r;

	public Circle5(double r) {
		this.r = r;
	}

	public double getArea() {
		return r * r * Math.PI;
	}

	default public void redraw()  {
		System. out. print (	"다시 그립니다. ");
		drow();
	}

	
}


public class MsMain {

	public static void main(String[] args) {
			Shape3 donut = new Circle5(10); // 반지를이 10인 원 객까 donut . redraw  
			System.out.println("area은 "+ donut.getArea());
			
		}
}
