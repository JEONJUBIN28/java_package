package day_2024_07_24;

// static -> 먼저 한번 올려 공유한다.
// static 함수에 instance라면 (함수, 변수)이 올수 없는 이유는?
// 왜? 

//정적 변수 = static변수 = 공유변수 = 클래스 변수
//1.먼저 한번 메모리에 올려 공유 (공유대상 : 인스턴스 객채)
class InstCnt {
	static int instNum = 100; // 클래스 변수 (static 변수)

	InstCnt() {
		instNum++;
		System.out.println("인스턴스 생성: " + instNum);

	}

}

class AccessWay {
	static int num = 0;

	AccessWay(){ incrCnt();}

	void incrCnt()
	{
		num++;
	}
}

class Card{
	String Kind;
	int num;
	public final static int WIDTH =180;
	public final static int HEIGHT = 120;
}

class AA{
	public AA() {
		System.out.println("AA"+"생성");
	}
	
	public void println() {
		System.out.println("메롱!!");
		System.out.println("메롱!!");
		System.out.println("메롱!!");
		
	}
}

class System2{
	static AA out=new AA();
}

//스택틱으로 안하면 (new)객체생성을 계속해야한다.

//javac ClassVar.java;
//java.exe ClassVar;

public class ClassVar {

	public static void main(String[] args) {
		
		System2.out.println();
		
		System.out.println(Math.PI);
		
		InstCnt.instNum -= 15;
		System.out.println(InstCnt.instNum);
		
		 InstCnt cnt1 = new InstCnt();
		InstCnt cnt2 = new InstCnt();
		InstCnt cnt3 = new InstCnt();
		
		AccessWay way = new AccessWay();
		way.num++;
		AccessWay.num++;
		System.out.println("num= "+AccessWay.num);

	}

}
