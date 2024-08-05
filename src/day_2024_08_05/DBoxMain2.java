package day_2024_08_05;

import java.util.Scanner;

class DBox<L, R> {
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

//class Box<T> {
//	private T ob;
//
//	public void set(T o) {
//		ob = o;
//	}
//
//	public T get() {
//		return ob;
//	}
//}

public class DBoxMain2 {
	public static void main(String[] args) {
		DBox<String, Integer> box = new DBox<String, Integer>();
		box.set("Apple", 25);
		System.out.println(box); // Apple & 25개
		
		DBox<String, Integer> box2 = new DBox<String, Integer>();
		box2.set("Orange", 25);
		System.out.println(box2); // Apple & 25개

		Box<String> sBox = new Box<>();
		sBox.set("I am so happy.");

		Box<Box<String>> wBox = new Box<>();
		wBox.set(sBox);

		Box<Box<Box<String>>> zBox = new Box<>();
		zBox.set(wBox);

		System.out.println(zBox.get().get().get());

	}

}
