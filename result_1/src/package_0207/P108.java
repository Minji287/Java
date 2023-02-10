package package_0207;

import java.util.Scanner;

public class P108 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("월을 입력하세요?");
		int month = scn.nextInt();
		switch(month) {
		case 3: case 4: case 5: {
			System.out.println("봄 입니다");
			break;
			}
		case 6: case 7: case 8: {
			System.out.println("여름 입니다");
			break;
			}
		case 9: case 10: case 11: {
			System.out.println("가을 입니다");
			break;
			}
		case 12: case 1: case 2: {
			System.out.println("겨울 입니다");
			break;
			}
		}
	}
}
