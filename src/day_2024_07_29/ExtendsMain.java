package day_2024_07_29;

import java.util.Arrays;

class AAA{
	int aaa;
	
	public void aaaFuntion(){
		System.out.println("aaaFuntion 함수호출");
	}
}
//상속
class BBB extends AAA{
	int bbb;
}


public class ExtendsMain {

	public static void main(String[] args) {
		AAA aaa = new AAA();
		
		System.out.println(aaa.aaa);
		aaa.aaaFuntion();
		
		BBB bbb = new BBB();
		
		System.out.println(bbb.aaa);
		aaa.aaaFuntion();
		
		System.out.println(bbb.bbb);
		
	}
}
