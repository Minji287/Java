package package3;

class Car06{
	String colorString;
	int door;
	void drive() {
		System.out.println("운전 가능하다.");
	}
	void stop() {
		System.out.println("운전을 멈춤.");
	}
}
class FireEngine7 extends Car06{
	String color = "red";
	void drive() {
		System.out.println("운전도 하고 불 끄는 것도 가능하다.");
	}
	void water() {
		System.out.println("소방차는 물을 뿌린다.");
	}
}

public class DOWNcasting {
	public static void main(String[] args) {
		Car06 car = new FireEngine7(); // 업캐스팅
		car.drive();
		car.stop();
		
		FireEngine7 fe = (FireEngine7)car; // 명시적 다운캐스팅
		fe.water(); // 자식에게만 있는 메소드를 사용 가능하게 된다.
		fe.stop();
		fe.stop();
		fe.drive();
		car.drive();
	}

}
