package day_2024_08_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PracticeMain {

	public static void main(String[] args) {

		while (true) {
			try {
				Scanner sc = new Scanner(System.in);

				System.out.println("***계산기***");
				System.out.println("수1 : ");
				int num1 = sc.nextInt();
				System.out.println("수2 : ");
				int num2 = sc.nextInt();
				System.out.println("연산 : ");
				String calculation = sc.next();

				if (calculation.equals("+")) {
					System.out.println("계산결과 : " + (num1 + num2));
				} else if (calculation.equals("-")) {
					System.out.println("계산결과 : " + (num1 - num2));
				} else if (calculation.equals("*")) {
					System.out.println("계산결과 : " + (num1 * num2));
				} else if (calculation.equals("/")) {
					System.out.println("계산결과 : " + (num1 / num2));
				}

				System.out.println("계속 하시겠습니까? 계속 : Y , 종료 : N");
				String YesOrNo = sc.next();
				if (YesOrNo.equals("y") || YesOrNo.equals("y"))
					continue;
				else
					System.out.println("종료합니다.");
				break;
			} catch (ArithmeticException | InputMismatchException e) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}
	}
}
