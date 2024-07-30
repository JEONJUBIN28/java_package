package day_2024_07_30;


/*
 * 
 */


class Buyer{
	private int money;
	private String cart;
	
	public Buyer(int money, String cart){
		this.cart=cart;
		this.money=money;
	}
	
	
	
}

public class ExerciseMain {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();

	}
}
