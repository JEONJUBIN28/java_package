package day_2024_08_01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println(7 / 2);
			// System.out.println(7 / 0); // 죽는자리
			System.out.println("숫자를 넣으세요.");
			int a = sc.nextInt();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러 입니다.");
//		} catch (ArithmeticException e) {
//			e.printStackTrace();
//			System.out.println("에러 입니다.");
		} finally {

			System.out.println("굿바이");
		}

		System.out.println("종료입니다.");

	}
}
