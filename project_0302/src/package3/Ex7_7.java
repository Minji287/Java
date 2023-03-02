package package3;

public class Ex7_7 {
	public static void main(String[] args) {
		Car cc = new FireEngine(); // 업캐스팅
		FireEngine fe2 = (FireEngine)cc; // 다운캐스팅
		fe2.water();
		fe2.drive();
	}

}
class Car{
	String color;
	int door;
	void drive() {
		System.out.println("drive, Brrrr~");
	}
	void stop() {
		System.out.println("stop!!!");
	}
}
class FireEngine extends Car{
	void water() {
		System.out.println("water!!!");
	}
}