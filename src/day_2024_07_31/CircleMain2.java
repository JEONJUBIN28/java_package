package day_2024_07_31;


class Circle4 {
	private int radius;

	public Circle4(int radius) {
		this.radius = radius;
	}

	public String toString() {
		return "넓이는 "+ "100" +"입니다.";
	}
}
public class CircleMain2 {

	public static void main(String[] args) {
		
		Object obj = new Circle4(10);
		System.out.println(obj);
	}
	
}
