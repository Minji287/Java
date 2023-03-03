package package_1;

class Car77 { }
class FireEngine77 extends Car77 {
	void dowork(Car77 c) {
		if(c instanceof FireEngine77) { // Car77 c = new FireEngine77(); 가능한지
			FireEngine77 fe = (FireEngine77)c;
			fe.water();
		}
	}
	void water() {
		System.out.println("water!!!");
	}
}

class Ambulance extends Car77 { }
public class InstanceOfMain {
	public static void main(String[] args) {
		FireEngine77 f = new FireEngine77();
		f.dowork(f);
		System.out.println(f instanceof Car77);
		System.out.println(f instanceof Object);
		System.out.println(f instanceof FireEngine77);
		
		Object obj = (Object)f;
		System.out.println(obj instanceof FireEngine77);
		Car77 c = (Car77)f;
	}

}
