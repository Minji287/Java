package package_2;

class MyPoint2 {
	int x;
	int y;
}
class Circle2 { // 포함
	MyPoint2 p = new MyPoint2(); // 참조변수 초기화
	int r;
}

public class InheritanceTest2 {

	public static void main(String[] args) {
		Circle2 c = new Circle2();
		c.p.x = 1;
		c.p.y = 2;
		c.r = 3;
		System.out.println("c.p.x = " + c.p.x);
		System.out.println("c.p.y = " + c.p.y);
		System.out.println("c.r = " + c.r);
	}

}
