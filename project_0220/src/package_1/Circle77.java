package package_1;

public class Circle77 {
	public int radius;
	public String name;
	public Circle77(int n1, String p1) {
		radius = n1;
		name = p1;
	}
	public Circle77() {} // 기본 생성자, 매개변수가 있는 생성자가 있을때는 자동으로 만들지 않는다
	public double getArea() {
		return 3.14*radius*radius;
	}
	public static void main(String[] args) {
		Circle77 pizza = new Circle77(10, "자바피자"); // 오버로딩
		Circle77 pizza2 = new Circle77();
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
	}

}
