package day_2024_08_07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class IntLinkedList{
	int num;
	IntLinkedList link;
	
	public IntLinkedList(int num) {
		this.num = num;
	}
}

class Circle {
	private double rad;
	
	
	public Circle(double r){
		this.rad = r;
	}
	
	public double getArea() {
		return rad * rad * Math.PI;
	}
	
}

public class ArrayListMain {

	public static void main(String[] args) {
		
		List<Circle> circleList = new ArrayList<>();
		
		circleList.add(new Circle(10));
		circleList.add(new Circle(20));
		circleList.add(new Circle(30));
		
		double sum = 0;
		
		for (Circle circle : circleList) {
			sum += circle.getArea();
		}
		
		System.out.println(sum);
		
		
//		LinkedList<Integer> list = new LinkedList<>();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		
//		int n;
//		for(Iterator < Integer> itr = list.iterator(); itr.hasNext();) {
//			n = itr.next();
//			System.out.println(n + "\t");
//		}
//		
//		IntLinkedList l1 = new IntLinkedList(1);
//		IntLinkedList l2 = new IntLinkedList(2);
//		IntLinkedList l3 = new IntLinkedList(3);
//		
//		l1.link = l2;
//		l2.link = l3;
		
		
		//List<String> list = new ArrayList<>();
		//List<String> list = new LinkedList<>();
		
		// 컬렉션 인스턴스에 문자열 인스턴스 저장
//		list.add("Toy");
//		list.add("Box");
//		list.add("Robot");
		
		// 저장된 문자열 인스턴스의 참조
//		for(int i = 0; i < list.size(); i++)
//			System.out.print(list.get(i)+'\t');
//	
//		
//		for (String str : list) {
//			System.out.println(str);
//		}
//		
//		
//		Iterator<String> iterator = list.iterator();
//		while(iterator.hasNext()) {
//			String str = iterator.next();
//			System.out.println(str);
//		}
		
		
		//list.remove(0); // 첫 번째 인스턴스 삭제
		
		// 첫 번째 인스턴스 삭제 후 나머지 인스턴스들을 참조
//		for(int i = 0; i <list.size(); i++)
//			System.out.print(list.get(i) + '\t');
//		System.out.println();

	}
}
