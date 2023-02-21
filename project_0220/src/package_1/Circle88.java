package package_1;

public class Circle88 {
	int radius; // 매개변수(인스턴스변수)
	public Circle88(int radius) {
		this.radius = radius;
	}
	public void set(int radius) {
		this.radius = radius;
	}
	
	public static void main(String[] args) {
		Circle88 ob1 = new Circle88(1);
		Circle88 ob2 = new Circle88(2);
		Circle88 ob3 = new Circle88(3);
		
		ob1.set(4);
		System.out.println(ob1.radius);
		ob2.set(5);
		System.out.println(ob2.radius);
		ob3.set(6);
		System.out.println(ob3.radius);
	}

}
