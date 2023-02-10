package package_1;

import java.util.Scanner;

public class P108 {

	public static void main(String[] args) {
		/*
		 * P108
		 * 1) 키보드를 통해서 월을 입력 받아  switch ~ case 문을 사용하여 
		 * 3, 4, 5 > 봄, 6, 7, 8 > 여름, 9, 10,11 > 가을, 12, 1, 2 > 겨울을 출력하는 프로그램 작성
		 */
		Scanner in = new Scanner(System.in);
		
		System.out.println("월을 입력해주세요.");
		int month = in.nextInt();
		
		switch(month) {
			case 3: case 4: case 5:
				System.out.println("봄");
				break;
			case 6: case 7: case 8:
				System.out.println("여름");
				break;
			case 9: case 10: case 11:
				System.out.println("가을");
				break;
			case 12: case 1: case 2:
				System.out.println("겨울");
				break;
		}
	}

}
