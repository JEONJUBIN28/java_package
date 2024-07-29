package day_2024_07_29;

/*
1. 프로그램을 완성 하시오. 반드시 외워야한다.

- 5개의 숫자를 랜덤 으로 받아 배열로 저장
- 5개의 숫자 중 가장 큰 값을 출력.
*/

import java.util.Arrays;

import java.util.Iterator;

class Box{
	private int num;
	private String contents;
	
	public Box (int num,String contents) {
		this.contents=contents;
		this.num=num;
	}
	public int getBoxNum() {
		return num;
	}
	
	public String toString() {
		return contents;
	}
}

public class ArrayMaxMain {

	public static void main(String[] args) {
		
		
//		Box[] ar = new Box[5];
//		ar[0] = new Box(101, "Coffee");
//		ar[1] = new Box(202, "Coffee");
//		ar[2] = new Box(303, "Coffee");
//
//		// 배열에서 번호가 505인 Box를 찾아 그 내용물을 출력하는 반복문
//		for (Box e : ar) {
//			if (e.getBoxNum() == 202)
//				System.out.println(e);
//		}

//		int[] ar = { 1, 2, 3, 4, 5 };
//
//		// 배열요소 전체 출력
//		for (int e : ar) {
//			System.out.println(e + " ");
//		}
//		System.out.println();// 단순 줄 바꿈을 목적으로
//
//		int sum = 0;
//
//		// 배열 요소의 전체 합 출력
//		for (int e : ar) {
//			sum += e;
//		}
//		System.out.println("sum: " + sum);
//
//		System.out.println();// 단순 줄 바꿈을 목적으로
//
//		int[] arr = { 1, 2, 3 };
//
//		// 1.5버전부터
//		for (int i : arr) {
//			System.out.println(i);
//		}

		////////////////////////////////////
//		int[] arrInt = new int[5];
//
//		// 입력
//		for (int i = 0; i < arrInt.length; i++) {
//			arrInt[i] = (int) ((Math.random() * 100) + 1);
//		}
//
//		// min값
//		int min = arrInt[0];
//		for (int i = 0; i < arrInt.length; i++) {
//			if (min > arrInt[i])
//				min = arrInt[i];
//
//		}
//		System.out.println();// 단순 줄 바꿈을 목적으로
//
//		// 출력
//		System.out.println(Arrays.toString(arrInt));
//		System.out.println(min);

//		int[] arrInt = new int[5];

//		// 입력
//		for (int i = 0; i < arrInt.length; i++) {
//			arrInt[i] = (int) ((Math.random() * 100) + 1);
//		}
//
//		// max값
//		int max = arrInt[0];
//		for (int i = 0; i<arrInt.length; i++ ) {
//			if(max < arrInt[i])
//				max= arrInt[i];
//			
//		}
//		//출력
//		System.out.println(Arrays.toString(arrInt));
//		System.out.println(max);

	}
}
