package package_2;

public class Ex7_11 {
	int s1 = 99; // 멤버변수 -> 인스턴스변수 (객체생성해서 사용)
	static int s2 = 88; // 멤버변수 -> 클래스변수 (앞에 클래스 이름 붙여서 사용)
	public static void main(String[] args) {
		int s2 = 77;
		int s3 = 66; // 지역변수
//		Child3 c = new Child3();
//		c.method1();
//		c.method2();
//		MyInterface.staticMethod();
//		MyInterface2.staticMethod();
		
		Ex7_11 rr = new Ex7_11();
		System.out.println(rr.s1);
		
		System.out.println(Ex7_11.s2);
		System.out.println(s2);
		System.out.println(s3);
	}
}

class Child3 extends Parent3 implements MyInterface, MyInterface2 {
	public void method1() {
		System.out.println("method1() in Child3"); // 오버라이딩
	}
}

class Parent3 {
	public void method2() {
		System.out.println("method2() in Parent3"); // 오버라이딩
	}
}

interface MyInterface {
	default void method1() {
		System.out.println("method1() in MyInterface");
	}
	
	default void method2() {
		System.out.println("method2() in MyInterface");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() is in MyInterface");
	}
}

interface MyInterface2 {
	default void method1() {
		System.out.println("method2() in MyInterface2");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface2");
	}
}

