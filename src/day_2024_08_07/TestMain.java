package day_2024_08_07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Num2{
	private int num;
	
	public Num2(int num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		return String.valueOf(num);
	}
	
	@Override
	public int hashCode() {
		return num % 3; //num의 값이 같으면 부류도 같다.
	}
	
	@Override
	public boolean equals(Object obj) {  // num의 값이 같으면 true 반환
		if(num ==((Num2)obj).num)
			return true;
		else
			return false;
	}
}


public class TestMain {

	public static void main(String[] args) {
		HashSet<Num2> set = new HashSet<>();
        set.add(new Num2(7799));
        set.add(new Num2(9955));
        set.add(new Num2(7799));

        System.out.println("인스턴스 수: " + set.size());

        for(Num2 n : set)
            System.out.print(n.toString() + '\t');

        System.out.println();
	}
}
