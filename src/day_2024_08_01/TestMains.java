package day_2024_08_01;

interface Printable2 {
	public void print(String doc);
}

class SPrinterDriver2 implements Printable2 {

	@Override
	public void print(String doc) {
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}

}

class LPrinterDriver2 implements Printable2 {

	@Override
	public void print(String doc) {
		System.out.println("From LG printer");
		System.out.println(doc);
	}

}

class Circle1 {
	private double raiuse;

	public Circle1(double r) {
		this.raiuse = r;
	}

	public String toString() {
		return "넓이는 " + "100" + "입니다.";
	}
}

public class TestMains {

	public static void main(String[] args) {

		Object obj = new Circle1(10);

		System.out.println(obj); // 출력: 넓이는 100 입니다. (예시)

		System.out.println();

		String myDoc = "This is a report about...";

		// 삼성 프린터로 출력
		Printable2 prn = new SPrinterDriver2();
		prn.print(myDoc);
		System.out.println();

		// LG 프린터로 출력
		prn = new LPrinterDriver2();
		prn.print(myDoc);

	}
}
