package day_2024_08_08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Person3 {
	private String name;
	private int age;
	
	public Person3(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(name.equals(((Person3) obj).name) && age == ((Person3) obj).age)
			return true;
		else
			return false;
	}
	
	@Override
	public String toString() {
		return name + "(" + age + "세)";
	}
}

public class TestMain {

	public static void main(String[] args) {
		
		HashSet<Person3> hSet = new HashSet<Person3>();
		hSet.add(new Person3("LEE", 10));
		hSet.add(new Person3("LEE", 10));
		hSet.add(new Person3("PARK", 35));
		hSet.add(new Person3("PARK", 35));

		System.out.println("저장된 데이터 수: " + hSet.size());
		System.out.println(hSet);

		/*
		============
		저장된 데이터 수: 2
		[LEE(10세), PARK(35세)]
		*/
		
		Set<Integer> lottoSet = new HashSet<>();
		final int LOTTO = 6;
		
		while(lottoSet.size() < LOTTO) {
			int num = (int)((Math.random()*45)+1);
			lottoSet.add(num);
		}
		System.out.println(lottoSet);
	}
}
