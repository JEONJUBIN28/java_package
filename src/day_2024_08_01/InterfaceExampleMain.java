package day_2024_08_01;

interface Icalculator {
	int add(int num1, int num2);

	int sud(int num1, int num2);

	int mul(int num1, int num2);

	int div(int num1, int num2);
}

class Mycalculator implements Icalculator {
	public Mycalculator(int num1, int num2) {
	}

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int sud(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public int mul(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int div(int num1, int num2) {

		if (num2 == 0) {
			System.out.println("잘못된입력");
			return 0;
		}

		return num1 / num2;
	}
}

interface IFruit {
	public abstract void print();
}

class Grape implements IFruit {

	@Override
	public void print() {
		System.out.println("나는 " + "포도이다.");

	}

}

class Apple implements IFruit {
	
	@Override
	public void print() {
		System.out.println("나는 사과이다.");

	}
}

class Pear implements IFruit {
	
	@Override
	public void print() {
		System.out.println("나는 배이다.");

	}
}

public class InterfaceExampleMain {

	public static void main(String[] args) {

		IFruit fAry[] = { new Grape(), new Apple(), new Pear() };
		for (IFruit f : fAry)
			f.print();

		Icalculator calculator = new Mycalculator(0, 0);
		System.out.println(calculator.add(0, 0)); // 0
		System.out.println(calculator.sud(1, 1)); // 0
		System.out.println(calculator.mul(0, 0)); // 0
		System.out.println(calculator.div(1, 1));

	}
}
