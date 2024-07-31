package day_2024_07_31;

class A {
	public void aaa() {
		System.out.println("aaa호출");
	}
}

class B extends A {
	public void bbb() {
		System.out.println("bbb호출");
	}
}

class C extends B {
	public void bbb() {
		System.out.println("ccc호출");
	}
}

class Box {
	public void simpleWrap() {
		System.out.println("Simple Wrapping");
	}
}

class PaperBox extends Box {
	public void paperWrap() {
		System.out.println("Paper Wrapping");
	}
}

class GoldPaperBox extends PaperBox {
	public void goldWrap() {
		System.out.println("Gold Wrapping");
	}
}

public class ObjCastingMain {

	public static void wrapBox(Box box) {
		
		if (box instanceof GoldPaperBox) {
			((GoldPaperBox) box).goldWrap();
		} 
		else if (box instanceof PaperBox) {
			PaperBox pBox = (PaperBox)box;
			pBox.paperWrap();
			
			((PaperBox) box).paperWrap();
		} 
		else {
			box.simpleWrap();
		}
	}

	public static void main(String[] args) {

		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();

		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);

		A a = new B(); // 다형성

		if (a instanceof B) {
			B b = (B) a; // 자식 = (자식)부모, 부모의 주소가 자식으로 생성되었을때 형변환 가능.
			b.bbb();
			
			((B)a).bbb();
			
		}

		a = new C();
		if (a instanceof B) {
			System.out.println("트루입니다.");
		}

		if (a instanceof A) {
			System.out.println("트루입니다.");
		}

		if (a instanceof C) {
			System.out.println("트루입니다.");
		}

	}
}
