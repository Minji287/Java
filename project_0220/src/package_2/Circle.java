package package_2;

public class Circle { // 객체 치환
	int radius;
	int num; // 0
	String str;
	
	public Circle(String str, int num) {
		this.str = str;
//		this.num = num; 안해주면 결과값 0
	}
	public Circle(int radius) {
		this.radius = radius;
	}
	public void set(int radius) {
		this.radius = radius;
	}
	
	public static void main(String[] args) {
		Circle a = new Circle("Hi", 3);
		Circle ob1 = new Circle(1);
		Circle ob2 = new Circle(2);
		Circle s = ob2;
		ob1 = ob2;
		System.out.println("a= " + a.str + " " + a.num);
		System.out.println("ob1.radius= " + ob1.radius);
		System.out.println("ob2.radius= " + ob2.radius);
		System.out.println("s.radius= " + s.radius);
		System.out.println("ob1 = " + ob1);
		System.out.println("ob1 = " + ob2);
		System.out.println("s = " + s);
		ob1.set(3);
		System.out.println("ob1.radius= " + ob1.radius);
	}

}
