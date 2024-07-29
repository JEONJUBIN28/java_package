package day_2024_07_29;

import java.util.Arrays;

public class TwoDimenMain {

	public static void main(String[] args) {
		int[][] arrTwo = new int[4][4];

		//입력
		for (int i = 0; i < arrTwo.length; i++) {
			for (int j = 0; j < arrTwo[i].length; j++) {
				arrTwo[i][j] = (int) ((Math.random() * 10) + 1);
			}
		}
		
		//출력
		for (int i = 0; i < arrTwo.length; i++) {
			for (int j = 0; j < arrTwo[i].length; j++) {
				System.out.print(arrTwo[i][j] + "\t");
			}
			System.out.println();
		}

//		int[][] arr = { 
//				{ 11 },
//				{ 22, 33 },
//				{ 44, 55, 66 } 
//				};
//
//		// 배열의 구조대로 내용 출력
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + "\t");
//			}
//			System.out.println();
//		}

//		int[][] arr = new int[4][9];
//		
//		int num = 1;
//
//		// 배열에 값을 저장
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = num;
//				num++;
//			}
//		}
//
//		// 배열에 저장된 값을 출력
//		for(int i = 0; i<arr.length;i++) {
//			for(int j = 0; j<arr[i].length; j++) {
//				System.out.print(arr[i][j] + "\t");
//			}
//			System.out.println();
//		}
	}
}
