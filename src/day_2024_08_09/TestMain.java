package day_2024_08_09;

import java.util.Set;
import java.util.TreeMap;

public class TestMain {

	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");
		
		Set<Integer> ks = map.keySet();
		
		for (Integer n : ks)
			System.out.print(map.get(n).toString() + '\t');
		System.out.println();

	}
}
