package day_2024_07_29;

class MoneyArr {
	private int money;
	//private int[] coin = new int[4];
	private int[] coin = { 500000, 10000, 5000, 1000, 500, 100, 50, 10 };

	public MoneyArr(int money) {
		this.money = money;
		// coin[0] = 500;
		// coin[1] = 100;
		// coin[2] = 50;
		// coin[3] = 10;
	}

	public void show() {
		for (int i = 0; i < coin.length; i++) {
			System.out.println(coin[i] + "원" + money / coin[i] + "개");
			money = money % coin[i];
		}
	}
}

public class MoneyArrMain {

	public static void main(String[] args) {
		
		MoneyArr mArr = new MoneyArr(2650);
		mArr.show();

	}
}
