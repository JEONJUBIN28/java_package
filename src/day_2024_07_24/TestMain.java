package day_2024_07_24;

import java.util.Scanner;

class Game{
	private final int CHANCE_COUNT = 5;
	private int chance;
	private int answer;

	public Game() {
		chance = CHANCE_COUNT;
		answer = (int) ((Math.random() * 3) + 1);
	}

	public void run() {

		System.out.println("가위, 바위, 보 중 하나를 입력하세요." + answer);

		while (true) {
			Scanner sc = new Scanner(System.in);

			System.out.println("숫자를 입력해주세요(1~50사이의 값을 입려해주세요.)");
			System.out.print(">>>");

			// 사용자 입력 받기
			int input = sc.nextInt();

			if (input == answer) {
				System.out.println("정답입니다.");
				break;
			}

			if (chance == 1) {
				System.out.println("실패하였습니다.정답은" + answer + "입니다.");
				break;
			}

			// 1회가 끝나면 기회를 1개씩 줄인다.
			chance--;

			if (input > answer) {
				System.out.println("다운!!기회가" + chance + "번 남았습니다.");
			} else {
				System.out.println("업!!기회가" + chance + "번 남았습니다.");
			}

		}

	}

}

class AA2{
	
	public AA2() {
		System.out.println("AA생성");
	}
	public void println() {
		System.out.println("메롱!!");
		System.out.println("메롱!!");
		System.out.println("메롱!!");
	}
}
class System3{
	static AA2 out=new AA2();
}

public class TestMain {

	public static void main(String[] args) {
		
		System3.out.println();
	}
}
