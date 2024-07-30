package day_2024_07_30;

/*
 * 다형성, 함수오버라이딩 응용
*/

class Dance {
	public void dance() {
		System.out.println("춤을춥니다");
	}
}

class PersonDance extends Dance {

	@Override
	public void dance() {
		System.out.println("사람이 춤을 춥니다.");
	}
}

class RovotDance extends Dance {

	@Override
	public void dance() {
		System.out.println("로봇이 춤을 춥니다.");
	}
}

class AIDance extends Dance {

	@Override
	public void dance() {
		System.out.println("AI가 춤을 춥니다.");
	}
}

class Shape {

	public double getArea() {
		return 0;
	}
}

class Circle extends Shape {
	public double r;

	public Circle(double r) {
		this.r = r;
	}

	@Override
	public double getArea() {
		return r * r * Math.PI;
	}
}

class Rectangle extends Shape {
	public double widht, height;

	public Rectangle(double widht, double height) {
		this.widht = widht;
		this.height = height;
	}

	@Override
	public double getArea() {
		return widht * height;
	}
}

class Triangle extends Shape {
	public double widht, height;

	public Triangle(double widht, double height) {
		this.widht = widht;
		this.height = height;
	}

	@Override
	public double getArea() {
		return widht * height/2.0;
	}
}

public class PolymorphismMain {

	public static void main(String[] args) {

		Dance dance = new PersonDance();
		dance.dance();

		dance = new RovotDance();
		dance.dance();

		dance = new AIDance();
		dance.dance();

		Dance[] arrDance = { new PersonDance(), new RovotDance(), new AIDance() };

		for (Dance dan : arrDance) {
			dan.dance();
		}

		Circle circle = new Circle(5);
		Rectangle rec = new Rectangle(5, 5);

		double area = circle.getArea() + rec.getArea();
		System.out.println(area);

		Shape[] arrShape = { new Circle(5), new Rectangle(5, 5), new Triangle(10,5)};
		area = 0;
		for (Shape shape : arrShape) {
			area = area + shape.getArea();
		}
		System.out.println(area);
	}
}
