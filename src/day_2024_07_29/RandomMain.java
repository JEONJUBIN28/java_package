package day_2024_07_29;

import java.util.Arrays;

import java.util.Scanner;

public class RandomMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int COUNT = sc.nextInt();
		;
		int[] arrNum = new int[COUNT];

		for (int i = 0; i < arrNum.length; i++) {
			arrNum[i] = (int) ((Math.random() * 100) + 1);

			for (int j = 0; j < i; j++) {
				if (arrNum[j] == arrNum[i]) {
					i--;
					break;
				}
			}
		}
		System.out.print(Arrays.toString(arrNum));

	}
}
