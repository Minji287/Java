package package_2;

import java.util.Scanner;

public class Test_6 {

	public static void main(String[] args) {
//		키보드에서 한개의 수를 입력 받아 정수의 값이 20보다 더 크면
//		20보다 큽니다 아니면 20보다 작습니다 출력
		Scanner scn = new Scanner(System.in);
		
		System.out.println("값을 입력해주세요");
		int x = scn.nextInt();
		int y = 20;
		
		if(x > 20) {
			System.out.println("입력 값 " + x + "은(는) " + y + "보다 큽니다");
		} else {
			System.out.println("입력 값 " + x + "은(는) " + y + "과 같거나 작습니다");
		}
	}

}
