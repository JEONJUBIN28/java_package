package day_2024_07_29;

import java.util.Arrays;

public class LottoMain {

	public static void main(String[] args) {	
		String[] sr = new String[4];

		sr[0] = new String("Java");
		sr[1] = new String("System");
		sr[2] = new String("Compiler");
		sr[3] = new String("Park");

		int cnum = 0;

		for (int i = 0; i < sr.length; i++)
			cnum += sr[i].length();

		System.out.println("총 문자의 수: " + cnum);

		int[] randomArr = new int[5];

		for (int i = 0; i < randomArr.length; i++) {
			randomArr[i] = (int) ((Math.random() * 100) + 1);
		}
		int max = randomArr[0];

		for (int i = 0; i < randomArr.length; i++) {

			if (max < randomArr[i])
				max = randomArr[i];
		}
		System.out.println(Arrays.toString(randomArr));
		System.out.println(max);

		final int LOTTO_COUNT =6;
		int[] arrLotto = new int[LOTTO_COUNT];
		
		for(int i = 0; i<arrLotto.length; i++) {
			arrLotto[i] = (int) ((Math.random() * 45) + 1);
			
			for (int j = 0; j<i; j++) {
				if(arrLotto[j]==arrLotto[i]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arrLotto));
	}
}
