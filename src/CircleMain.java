//defalut package란? 
//=> 패키지 선언이 안되어 있으면 디폴트 패키지임.
import com.wxfs.smart.Circle;

public class CircleMain {

	public static void main(String[] args) {
		Circle circle = new Circle(10);
		System.out.println(circle.getArea());
		
		com.fxmx.simple.Circle circleb = new com.fxmx.simple.Circle(10);
		System.out.println(circleb.getPara());
		
	}
	
}
