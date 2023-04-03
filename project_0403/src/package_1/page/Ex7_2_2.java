package package_1.page;

public class Ex7_2_2 {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
}
class Parent2{ int x = 10;}
class Child2 {
	Parent2 parent = new Parent2();
	int x = 20; 
	void method() {
		System.out.println("x = " + x);
		System.out.println("Parent.x = " + parent.x);
	}
}