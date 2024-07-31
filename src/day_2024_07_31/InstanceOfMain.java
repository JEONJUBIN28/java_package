package day_2024_07_31;

//public void println(Object x = new A2){

//Public String ToString(){
//  return getClass().getName() + "@" + Integer.toHexString(hashCode());
//}

//@ = 함수 = 짜는 방법이 따로 존재함.

class A2 /* extends Object */ {
	public void aaa() {
		System.out.println("aaa호출");
	}

	@Override
	public String toString() {
		return "주소나오지마";
	}
}

class B2 extends A2 {
	public void bbb() {
		System.out.println("bbb호출");
	}
}

class Shape2 {

	public double getArea() {
		return 0;
	}
}

class Circle2 extends Shape {

	public double r;

	public Circle2(double r) {
		this.r = r;
	}

	public double getArea() {
		return r * r * Math.PI;
	}

	@Override 
	public String toString() {
		return "넓이는" + getArea() + "입니다.";
	}
}

class AA{
	public void aa() {}
}

class BB extends AA{
	
	@Override
	public void aa() {}
	
	//@Override// 부모에 해당 함수 없으면, 컴파일 에러 때려라.
	public void bb() {}
}

class ParentAdder {
	   public int add(int a, int b) {
	      return a + b;
	   }
	}

class ChildAdder extends ParentAdder {
	  // @Override//부모의 리턴타입 및 파라미터가 다르기에 오버라이딩이 불가하다.
	   public double add(double a, double b) {
	      System.out.println("덧셈을 진행합니다.");
	      return a + b;
	   }
	}

//class Object extends Circle{
//	
//	public Object 
//	
//}

//public void println(Object x = new A){

public class InstanceOfMain {

	public static void main(String[] args) {
		Object obj = new Circle2(10);
		System.out.println(obj); // 출력: 넓이는 100 입니다.

//		A2 a = new A2();
//		String str = "111";

		// System.out.println(a); // day_2024_07_31.A@48cf768c//toString()
		// System.out.println(str);
		// System.out.println(new A2()); // public void println(Object x = new A){
		// System.out.println(new B2()); // public void println(Object x = new B){

	}
}
