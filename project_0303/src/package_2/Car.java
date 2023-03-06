package package_2;

public class Car {
	int price;
	
	Car(int price){
		this.price = price;
	}
}
class Volvo extends Car{
	Volvo() {
		super(7000);
	}
	public String toString() {
		return "Volvo";
	}
}
class Genesis extends Car{
	Genesis() {
		super(8000);
	}
	public String toString() {
		return "Genesis";
	}
}
class Grandeur extends Car{
	Grandeur() {
		super(5000);
	}
	public String toString() {
		return "Grandeur";
	}
}
class BuyNew {
	int total = 5000;
	
	void buy2(Car c) {
		System.out.println(c + "를 선택하셨습니다.");
		System.out.println(c.price + "만원 입니다.");
	}
}