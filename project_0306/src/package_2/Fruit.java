package package_2;

public class Fruit {
	int price;
	int quantity;
	
	Fruit (int price, int quantity) {
		this.price = price;
		this.quantity = quantity;
	}
}
class Peach extends Fruit {
	Peach() {
		super(2000, 5);
	}
	public String toString() { return "복숭아"; }
}
class Apple extends Fruit {
	Apple() {
		super(2000, 7);
	}
	public String toString() { return "사과"; }
}
class Banana extends Fruit {
	Banana() {
		super(5000, 1);
	}
	public String toString() { return "바나나"; }
}
class Buy {
	int total = 0;
	void buy(Fruit f) {
		total = f.price*f.quantity;
		System.out.println(f + ": " + f.price + " * " + f.quantity + " = " + total + "원");
	}
}