package package_1;

public class CircleMain2 {
	public int radius; // 원의 반지름
	public String name; // 원의 이름
//	public Circle() {} // 기본생성자(자바가 대신 해줌)
	public CircleMain2() { // 매개 변수 없는 생성자, donut
	radius = 1; name = ""; // 필드 초기화
	}
	public CircleMain2(int r, String n) { // 매개 변수를 가진 생성자 , pizza
	radius = r; name = n; // 매개 변수로 필드 초기화
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	public static void main(String[] args) {
		CircleMain2 pizza = new CircleMain2(10, "자바피자"); // 매개 변수 사용해서 객체 생성
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		CircleMain2 donut = new CircleMain2();
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}

}
