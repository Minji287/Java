package chapter3;

public class Ex3_12 {

	public static void main(String[] args) {
		int x = 10;
		int y = 8;
		// printf로 출력
		System.out.printf("%d을 %d로 나누면, %n", x, y);
		System.out.printf("몫은 %d이고, 나머지는 %d입니다.%n", x/y, x%y);
		// println으로 출력								 몫, 나머지
		System.out.println(x + "을 " + y + "로 나누면,");
		System.out.println("몫은 " + (x/y) + "이고, 나머지는 " + (x%y) + "입니다.");
	}

}
