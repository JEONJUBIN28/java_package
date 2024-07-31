package day_2024_07_31;


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

public class TestMain {

	public static void main(String[] args) {
		
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
