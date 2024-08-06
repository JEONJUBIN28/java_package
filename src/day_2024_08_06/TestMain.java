package day_2024_08_06;

class Box<T>{
	private T ob;
	public void set(T o) {
		ob = o;
	}
	 
	public T get() {
		return ob;
	}
}

class DBox<L, R>{
	private L str;
	private R count;
	
	public void set(L str, R count) {
		this.count=count;
		this.str=str;
	}
	
	@Override
	public String toString() {
		return str + " & " + count + "개";
	}
	
}

public class TestMain {
	public static void main(String[] args) {
		DBox<String, Integer> box = new DBox<String, Integer>();
		box.set("Apple", 25);
		System.out.println(box); // Apple & 25개

		Box<Integer> ibox = new Box<>();
		Box<Double> dbox = new Box<>();

		dbox.set(1.0);
		double dNum = dbox.get();// 형변환도 필요없음
		System.out.println(dNum);

	}

}
