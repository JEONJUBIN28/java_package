package day_2024_07_30;


/*기능 : 지정된 물건을 구입한다. 가진 돈(money)에서 물건의 가격을 빼고, 장바구니(cart)에 담는다.
*만일 가진 돈이 물건의 가격보다 적다면 바로 종료한다.
*반환타입 : 없음
*매개변수 : Product p - 구입할 물건*/
class Buyer {

	int money = 1000;
	Product2[] cart = new Product2[3]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; // Product배열 cart에 사용될 index

	void buy(Product2 p) {

		/*
		 * 
		 * (1) 아래의 로직에 맞게 코드를 작성하시오 . 
		 * 1.1 가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드를 종료한다. 
		 * 1.2 가진 돈이 충분하면, 제품의 가격을 가진 돈에서 빼고 1.3 장바구니에 구입한 물건을 담는다.(add 메서드 호출 )
		 * 
		 */

		if (money < p.price) {
			System.out.println("잔액이 부족하여" + p.toString() + "살수없습니다.");
			return;
		}else {
			money-=p.price;
			add(p);
		}

	}

	/*
	 * 기능 : 지정된 물건을 장바구니에 담는다.
	 * 만일 장바구니에 담을 공간이 없으면, 장바구니의 크기를 2배로 늘린 다음에 담는다. 
	 * 반환타입 : 없음 
	 * 매개변수 : Product p - 구입할 물건
	 */
	void add(Product2 p) {

		/*
		 * 
		 * (2) 아래의 로직에 맞게 코드를 작성하시오. 
		 * 1.1 i의 값이 장바구니의 크기보다 같거나 크면 
		 * 1.1.1 기존의 장바구니보다 2배 큰 새로운 배열을 생성한다. 
		 * 1.1.2 기존의 장바구니의 내용을 새로운 배열에 복사한다. 
		 * 1.1.3 새로운 장바구니와 기존의 장바구니를 바꾼다. 1.2 물건을 장바구니(cart)에 저장한다. 
		 * 그리고 i의 값을 1 증가시킨다.
		 * 
		 */
		Product2[] newCart=null;
		
		if(i >= cart.length) {
			newCart = new Product2[cart.length*2];
			/*기존에 담겨 있던거를 새로운 cart로 옮겨야함*/
			for(int idx = 0; idx < cart.length; idx++) {
				newCart[idx]=cart[idx];
			}
			
			//System.arraycopy(cart,0,tmp,0,cart.length);
			cart=newCart;
		}
		
		cart[i++] = p;

	} // add(Product p)

	/*
	 * 기능 : 구입한 물건의 목록과 사용금액, 남은 금액을 출력한다.
	 * 반환타입 : 없음
	 * 매개변수 : 없음
	 */
	void summary() {

		/*
		 * (3) 아래의 로직에 맞게 코드를 작성하시오 .
		 *  1.1 장바구니에 담긴 물건들의 목록을 만들어 출력한다 . 
		 *  1.2 장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다. 
		 *  1.3 물건을 사고 남은 금액 를 출력한다(돈).
		 */
		
		   int sum = 0;
	       System.out.print("구입한 물건: ");
	       
	       for(int idx = 0; idx < i; idx++){
	          System.out.print(cart[idx].toString()+",");
	          sum += cart[idx].price;
	       }

	       System.out.println();
	       System.out.println("사용한 금액: " +sum);
	       System.out.println("남은 금액: " + money);

	} // summary()

}

class Product2 {
	int price; // 제품의 가격

	Product2(int price) {
		this.price = price;
	}
}

class Tv2 extends Product2 {

	Tv2() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product2 {

	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product2 {

	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}

}

public class ExerciseMain {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		b.buy(new Tv2());
		b.buy(new Computer());
		b.buy(new Tv2());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());

		b.summary();
	}
}
