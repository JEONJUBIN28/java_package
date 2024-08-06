package day_2024_08_06;

class BoxFactory {

	public static Box makeBox(Box o) {
		Box box = new Box();
		box.set(o);
		return box;
	}

	public static <T> Box<T> makeBox2(T o) {
		Box<T> box = new Box<T>();
		box.set(o);
		return box;
	}

//	public static Box<String> makeBox2(String o) {
//		Box<String> box = new Box<String>();
//		box.set(o);
//		return box;
//	}
	
	public static <T> T makeBox3(T o) {
	
		return o;
	}
	
	public static <T> T makeBox4(T o) {
		
		return o;
	}

}

public class GenernicMethodMain2 {
	public static void main(String[] args) {

		Box<String> sbox = BoxFactory.<String>makeBox2("sweet");
		System.out.println(sbox.get());

		Box<Integer> ibox = BoxFactory.<Integer>makeBox2(1);
		System.out.println(ibox.get());

		Integer i = BoxFactory.<Integer>makeBox3(1);
		System.out.println(i); // 출력
		
		Double d = BoxFactory.<Double>makeBox4(2.0);
		System.out.println(d); // 출력

	}

}
