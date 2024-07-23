package day_2024_07_23;

import java.util.Scanner;

class Money {
	int money;

	void setMoney(int money) {
		this.money = money;
	}

	void show() {

		int m50000, m10000, m5000, m1000, m500, m100;
		int tMoney;

		m50000 = money / 50000;
		tMoney = money % 50000; // money - (m50000*50000)

		m10000 = tMoney / 10000;
		tMoney = tMoney % 10000; // money - (m10000*10000)

		m5000 = tMoney / 5000;
		tMoney = tMoney % 5000; // money - (m5000*5000)

		m1000 = tMoney / 1000;
		tMoney = tMoney % 1000; // money - (m1000*1000)

		m500 = tMoney / 500;
		tMoney = tMoney % 500; // money - (m500*500)

		m100 = tMoney / 100;
		tMoney = tMoney % 100; // money - (m100*100)

		System.out.println("머니: " + money);

		System.out.println("오만원" + m50000 + "장");
		System.out.println("만원" + m10000 + "장");
		System.out.println("오천원" + m5000 + "장");
		System.out.println("천원" + m1000 + "장");
		System.out.println("오백원" + m500 + "개");
		System.out.println("백원" + m100 + "개");

	}
}

public class MoneyMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			Money money = new Money();
			System.out.print("머니:");
			int tmoney = sc.nextInt();
			System.out.print("오만원:");
			int m50000 = sc.nextInt();
			System.out.print("만원:");
			int m10000 = sc.nextInt();
			System.out.print("오천원:");
			int m5000 = sc.nextInt();
			System.out.print("천원:");
			int m1000 = sc.nextInt();
			System.out.print("오백원:");
			int m500 = sc.nextInt();
			System.out.print("백원:");
			int m100 = sc.nextInt();
			System.out.printf("계속하시겠습니까?y,n" + "\n");

			String yesOrNo = sc.next();

			if (yesOrNo.equals("Y") || yesOrNo.equals("y")) {
				continue;
			} else {
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
