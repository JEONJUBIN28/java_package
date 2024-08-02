package day_2024_08_02;

import java.util.ArrayList;

public class WrapperMain {

	public static void main(String[] args) {

		// 클래스 메소드를 통한 인스턴스 생성 방법 두 가지
		Integer n1 = Integer.valueOf(5); // 숫자 기반 Integer 인스턴스 생성
		Integer n2 = Integer.valueOf("1024"); // 문자열 기반 Integer 인스턴스 생성

		// 대소 비교와 합을 계산하는 클래스 메소드
		System.out.println("큰 수: " + Integer.max(n1, n2));
		System.out.println("작은 수: " + Integer.min(n1, n2));
		System.out.println("합: " + Integer.sum(n1, n2));
		System.out.println();

		// 정수에 대한 2진, 8진, 16진수 표현 결과를 반환하는 클래스 메소드
		System.out.println("12의 2진 표현: " + Integer.toBinaryString(12));
		System.out.println("12의 8진 표현: " + Integer.toOctalString(12));
		System.out.println("12의 16진 표현: " + Integer.toHexString(12));

		Integer num11 = new Integer(29);
		System.out.println(num11.intValue());
		System.out.println(num11.doubleValue());

		Double num2 = new Double(3.14);
		System.out.println(num2.intValue());
		System.out.println(num2.doubleValue());

		ArrayList<Integer> arrList = new ArrayList<Integer>();

		arrList.add(1);
		arrList.add(2);
		arrList.add(3);

		for (Integer num : arrList) {
			System.out.println(num);
		}

		int num = 10;
		Integer iObj = 10;// 박싱

		Integer iObj2 = new Integer(10);
		Integer iObj3 = Integer.valueOf(30);

		int max = Integer.MAX_VALUE;

		int num1 = iObj;// 객체를 기본형으로 = 언박싱
		num1 = iObj.intValue();

		System.out.println(num1);

		System.out.println(iObj);
		System.out.println(iObj2);
		System.out.println(iObj3);

	}

}
