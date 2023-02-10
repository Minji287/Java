package package_2;

import java.util.Scanner;

public class Test_5 {

	public static void main(String[] args) {
//		두개의 정수를 키보드에서 입력 받으세요
//		입력된 두 개의 수의 합계와 차이를 인쇄하시오
		Scanner scn = new Scanner(System.in);
		
		System.out.println("두개의 정수를 입력해주세요");
		int x = scn.nextInt();
		int y = scn.nextInt();
		
		System.out.println("두 수의 합은 " + (x+y) + "입니다");
		System.out.println("두 수의 차는 " + (x-y) + "입니다");
	}

}
