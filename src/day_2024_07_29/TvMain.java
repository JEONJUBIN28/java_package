package day_2024_07_29;

import java.util.Arrays;

class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	// 상속관련 - 자손에서는 언제든지 접근 가능(패키지와 상관없이)
	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV {

	protected int color;

	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}

	public void printProperty() {
		System.out.println(super.getSize() + " 인치 " + color + "컬러");
	}
}

class IPTV extends ColorTV {

	private String num;

	public IPTV(String num, int size, int color) {
		super(size, color);
		this.num = num;
	}
	
	public void printProperty() {
		System.out.println( num + "주소에 " +getSize()+"인치, "+ color + "컬러");
	}

}

// 32 인치 1024컬러
public class TvMain {

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();

		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); //
		iptv.printProperty();

	}
}
