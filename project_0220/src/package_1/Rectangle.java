package package_1;

import java.util.Scanner;

public class Rectangle {
	int width;
	int height;
	
	public int getArea() {
		return width*height;
	}
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(); // 객체 생성
		Scanner scanner = new Scanner(System.in); // scanner 객체 생성
		System.out.print(">> "); // 출력
		rect.width = scanner.nextInt(); // rect 객체에 width=멤버변수 중 인스턴변수에 입력
		rect.height = scanner.nextInt();
		System.out.println("사각형의 면적은 " + rect.getArea());
		scanner.close(); // scanner 닫기
	}

}
