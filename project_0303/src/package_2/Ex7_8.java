package package_2;
class Product {
	int price;			
	String name;
	int count;
	Product(int price, String name, int count) {
		this.price = price;
		this.name = name;
		this.count = count;
	}
}
class Watermelon1 extends Product {
	Watermelon1() {
		super(10000, "수박", 2);		
	}
	// Object클래스의 toString()을 오버라이딩한다.
	public String toString() { return "수박"; }
}
class Peach1 extends Product {
	Peach1() { super(2000,"복숭아", 5); }
	public String toString() { return "복숭아"; }
}
class Banna extends Product {
	Banna() { super(3000,"바나나", 5); }
	public String toString() { return "바나나"; }
}
class Buyer {	// 고객, 물건을 사는 사람
	int money = 100000;	  // 소유금액
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= (p.price*p.count);            // 가진 돈에서 구입한 제품의 가격을 뺀다.
		System.out.println(p + "을 " + "한개에 " + p.price + "를 " + p.count + "개 " + "총 " + (p.price*p.count) +  "원에 구입하셨습니다.");
	}
}
public class Ex7_8 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Watermelon1());
		b.buy(new Peach1());
		b.buy(new Banna());
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
	}
}
