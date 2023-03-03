package package_2;

import java.util.Scanner;

class Fruit {
	int price;
	int quantity;

	Fruit(int price, int quantity){
		this.price = price;
		this.quantity = quantity;
	}
}
class Watermelon extends Fruit{
	Watermelon(){
		super(10000, 2);
	}
	public String toString() { return "수박"; }
}
class Peach extends Fruit{
	Peach(){
		super(2000, 5);
	}
	public String toString() { return "복숭아"; }
}
class Banana extends Fruit{
	Banana(){
		super(5000, 2);
	}
	public String toString() { return "바나나"; }
}
class Buy{
	int total = 0;
	void purchase(Fruit f) {
		System.out.println(f + " " + f.price + "원 * "
					+ f.quantity + " = " + f.price*f.quantity + "원");
		total += f.price*f.quantity;
	}
	void total() {
		System.out.println("------------------------");
		System.out.printf("%22d", total);
		System.out.println("원");
	}
}

public class FruitMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.printf("%14s", "영수증\n");
		System.out.println("------------------------");
		Buy b = new Buy();
		b.purchase(new Watermelon());
		b.purchase(new Peach());
		b.purchase(new Banana());
		b.total();
	}

}
