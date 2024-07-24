package day_2024_07_24;

//static -> 먼저 한번 올려 공유한다.
//static 함수에 instance라면 (함수, 변수)이 올수 없는 이유는?
//왜? 메모리 생성순서 (시간차)가 다르기때문이다.

//정적 변수 = static변수 = 공유변수 = 클래스 변수
//1.먼저 한번 메모리에 올려 공유 (공유대상 : 인스턴스 객채)

//스태틱 함수는 기본적으로 스택변수 컨트롤 하기위해 만듦(즉 인스턴스 변수는 올수가 없다.)
class NumberPrinter {
	private int myNum = 0;

	static void showInt(int n) {
		System.out.println(n);
	}

	static void showDouble(double n) {
		System.out.println(n);
	}

	void setMyNumber(int n) {
		myNum = n;
	}

	void showMyNumber() {
		showInt(myNum);
	}
}

//원래 함수는 객채 생성해서 객채명.함수()~~ 이런식으로

public class ClassMethod {

	public static void main(String[] args) {
		NumberPrinter.showInt(20);
		NumberPrinter np = new NumberPrinter();
		np.showDouble(3.15);

		np.setMyNumber(75);
		np.showMyNumber();

	}

}
