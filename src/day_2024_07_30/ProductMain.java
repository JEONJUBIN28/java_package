package day_2024_07_30;

/*
 * 
 */

class Product {

	int price; // 제품의 가격

	int bonusPoint; // 제품구매 시 제공하는 보너스점수

	Product(int price) {

		this.price = price;

		bonusPoint = (int) (price / 10.0);

	}

}

class Tv extends Product {

	public Tv(int price) {
		super(price);
	}

	public String toString() {

		return "Tv";

	}

}

class MyTv2 {

	private boolean isPowerOn;

	private int channel;

	private int volume;

	final int MAX_VOLUME = 100;

	final int MIN_VOLUME = 0;

	final int MAX_CHANNEL = 100;

	final int MIN_CHANNEL = 1;

	public void getter(boolean isPowerOn, int channel, int volume) {
		this.isPowerOn = isPowerOn;
		this.channel = channel;
		this.volume = volume;
	}

	public void setter(boolean isPowerOn, int channel, int volume) {
		this.isPowerOn = isPowerOn;
		this.channel = channel;
		this.volume = volume;
	}

	public void setChannel(int channel) {
		this.channel = channel;

	}

	public int getChannel() {
		return channel;
	}

	public void setVolume(int volume) {
		this.volume = volume;

	}

	public int getVolume() {
		return volume;
	}

	/* (1) 알맞은 코드를 넣어 완성하시오. */

}

public class ProductMain {

	public static void main(String[] args) {

		MyTv2 t = new MyTv2();

		t.setChannel(10);

		System.out.println("CH : " + t.getChannel());

		t.setVolume(20);

		System.out.println("VOL : " + t.getVolume());

		//Tv t = new Tv(0);

	}
}
