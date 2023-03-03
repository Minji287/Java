package package_1;

class Calculator {
	// 정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	// 직사각형의 넓이
	// @overload
	double areaRectangle(double width, double height) {
		return width * height;
	}
}

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCal = new Calculator();
		System.out.println("정사각형: " + myCal.areaRectangle(10));
		System.out.println("직사각형: " + myCal.areaRectangle(10, 20));
	}

}
