package day_2024_08_06;

class Box1<T> {
	private T ob;

	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}
}

class DBox2<L, R> {
	private L str;
	private R count;

	public void set(L str, R count) {
		this.count = count;
		this.str = str;
	}

	@Override
	public String toString() {
		return str + " & " + count + "개";
	}

}

public class TestMain2 {
	private static <T> boolean compBox(Box1<T> ob1, T ob2) {
		if (ob1.get().equals(ob2)) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		
		Box<String> sbox = BoxFactory.<String>makeBox2("sweet");		
		System.out.println(sbox.get());
		
		Box<Integer> ibox = BoxFactory.<Integer>makeBox2(1);		
		System.out.println(ibox.get());
		
		Integer i = BoxFactory.<Integer>makeBox3(1);		
		System.out.println(i); //출력 1
		
		Double d = BoxFactory.<Double>makeBox3(2.0);		
		System.out.println(d); //출력 2.0
		
		
		
		
		Box1<Integer> box1 = new Box1<>();
		box1.set(24);

		Box1<String> box2 = new Box1<>();
		box2.set("Poly");

		if (compBox(box1, 25))
			System.out.println("상자 안에 25 저장");
		if (compBox(box2, "Moly"))
			System.out.println("상자 안에 Moly 저장");

		System.out.println(box1.get());
		System.out.println(box2.get());
	}

}
