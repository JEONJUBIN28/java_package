package day_2024_08_02;

import java.util.Scanner;

public class NewMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");

		String word = sc.nextLine();
		
		for (int i = 0; i < word.length(); i++) {
			System.out.print(word.substring(i));
			System.out.println(word.substring(0, i));
			System.out.println();
		}
		System.out.println(word);
        sc.close();
		
	}

}
