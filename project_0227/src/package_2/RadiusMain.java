package package_2;
// 클래스 2개
class Circle { // 클래스를 따로 만들어줌
	final double PI = 3.14;
	int radius;
	Circle(int r){
		this.radius = r;
	}
	public double show() {
		return radius*radius*PI;
	}
}

public class RadiusMain {
	
	public static void main(String[] args) {
// 		생성자를 이용해서 다음을 해결하는 프로그램을 작성하시오
//		원의 반지름이 3,4,5 인 경우의 각각의 원의 넓이를 인쇄합니다.
		Circle s1 = new Circle(3);
		System.out.println(s1.show());
		s1 = new Circle(4);
		System.out.println(s1.show());
		s1 = new Circle(5);
		System.out.println(s1.show());
		
//		Circle s1 = new Circle(3);
//		Circle s2 = new Circle(4);
//		Circle s3 = new Circle(5);
//		System.out.println(s1.show());
//		System.out.println(s2.show());
//		System.out.println(s3.show());
	}

}
