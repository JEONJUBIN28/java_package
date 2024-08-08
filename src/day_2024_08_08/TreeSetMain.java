package day_2024_08_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {//중복을 허용하는 리스트
		List<String> lst = Arrays.asList("Box","Toy","Box","Toy");
		ArrayList<String> list = new ArrayList<>(lst);
		
		for(String s : list)
			System.out.print(s.toString() + '\t');
		
		System.out.println();
		
		// 중복된 인스턴스를 걸러 내기 윈한 작업
		HashSet<String> set = new HashSet<>(list);
		
		//원래대로 ArrayList<String> 인스턴스로 저장물을 옮긴다.
		list = new ArrayList<>(set);
		
		for(String s : list)
			System.out.print(s.toString() + '\t');
		
		System.out.println();
		System.out.println();

		Set<Integer> lottoSet = new TreeSet<>();
		final int LOTTO = 6;

		while (lottoSet.size() < LOTTO) {
			int num = (int) ((Math.random() * 45) + 1);
			lottoSet.add(num);
		}
		System.out.println(lottoSet);

		System.out.println();

		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(3);
		tree.add(1);
		tree.add(2);
		tree.add(4);
		System.out.println("인스턴스 수: " + tree.size());

		// for-each문에 의한 반복
		for (Integer n : tree) {
			System.out.print(n.toString() + '\t');
		}
		System.out.println();

		// Iterator 반복자에 의한 반복
		for (Iterator<Integer> itr = tree.iterator(); itr.hasNext();)
			System.out.print(itr.next().toString() + '\t');
	}
}
