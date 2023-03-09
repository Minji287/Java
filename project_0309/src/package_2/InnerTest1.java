package package_2;

class AAA {
	int i = 100;
	BBB b = new BBB();
}
class BBB {
	void method() {
		AAA a = new AAA();
		System.out.println(a.i);
	}
}
class CCC {
	BBB b = new BBB();
}

public class InnerTest1 {

	public static void main(String[] args) {
		BBB bbb = new BBB();
		bbb.method();
	}

}
