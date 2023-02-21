package package_1;

public class Circle {
	public int radius; // 원의 반지름
	public String name; // 원의 이름
//	public Circle() {} // 기본생성자(자바가 대신 해줌)
	public double getArea() {
		return 3.14*radius*radius;
	}
}
