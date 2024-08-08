package day_2024_08_08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class MapMain {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		//TreeMap<Integer, String> map = new TreeMap<>(); 
		// 자료구조의 특성상으로 정렬된 순서로 key들에 접근한다.

		// Key-Value 기반 데이터 저장
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");
		// map.put(23, "홍길동");
		
		//map 함수에서 가끔 사용하는 함수들.
		System.out.println("1 " + map.containsKey(45)); // true or false를 체크하는 함수.
		System.out.println("2 " + map.containsKey(60));
		System.out.println("3 " + map.containsValue("홍길동"));
		System.out.println("4 " + map.isEmpty()); // 객체안에 데이터가 있는지 없는지 확인하는 함수.
		System.out.println("5 " + map.size());
		System.out.println("6 " + map); // toString으로 오버라이딩을 해준것을 보여주는 함수.
		System.out.println("7 " + map.replace(23, "홍길동"));

		System.out.println();

		// Key만 담고 있는 컬렉션 인스턴스 생성
		Set<Integer> ks = map.keySet();

		// 전체 Key 출력 (for-each문 기반)
		for (Integer n : ks)
			System.out.print(n.toString() + '\t');
		System.out.println();

		// 전체 Value 출력 (for-each문 기반)
		for (Integer n : ks)
			System.out.print(map.get(n).toString() + '\t');
		System.out.println();

		// 전체 Value 출력 (반복자 기반)
		for (Iterator<Integer> itr = ks.iterator(); itr.hasNext();)
			System.out.print(map.get(itr.next()) + '\t');
		System.out.println();
		System.out.println();

		System.out.println("23" + map.get(23));

		System.out.println();
		// 데이터 탐색
		System.out.println("23번: " + map.get(23));
		System.out.println("37번: " + map.get(37));
		System.out.println("45번: " + map.get(45));
		System.out.println();

		// 데이터 삭제
		map.remove(37);

		// 데이터 삭제 확인
		System.out.println("37번: " + map.get(37));

	}
}
