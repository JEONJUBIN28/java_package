package day_2024_08_07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {
//		Set<Integer> lottoSet = new HashSet<>();
//		final int LOTTO = 6;
//
//		while (lottoSet.size() < LOTTO) {
//			int num = (int) ((Math.random() * 45) + 1);
//			lottoSet.add(num);
//		}
//		
//		System.out.println(lottoSet);

//		for (Integer s : lottoSet) {
//			System.out.println(s + '\t');
//		}

		Set<String> set = new HashSet<>();
		set.add(new String("AAA"));
		set.add("AAA");
//		set.add(3);
//		set.add(1);
		
		System.out.println(set);
		System.out.println("인스턴스 수: " + set.size());
//
//		// 반복자를 이용한 전체 출력
//		for (Iterator<Integer> itr = set.iterator(); itr.hasNext();)
//			System.out.print(itr.next() + '\t');
//		System.out.println();
//
//		// for-each문을 이용한 전체 출력
//		for (Integer s : set) {
//			System.out.print(s + '\t');
//		}
	}
}
