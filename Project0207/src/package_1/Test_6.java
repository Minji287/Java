package package_1;

import java.util.Scanner;

public class Test_6 {

	public static void main(String[] args) {
//		x의 값이 5보다 더 크면 sum에 넣고 아니면 20을 sum에 넣어라
//		그리고 x와 sum을 인쇄하시오
		Scanner scn = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("값을 입력하시오");
		int x = scn.nextInt();
		
		if(x > 5) {
			sum = 5;
		} else {
			sum = 20;
		}
		System.out.println("x= " + x);
		System.out.println("sum= " + sum + "\n");
		
//		값 넣고 인쇄
		int k1 = 45;
		int k2 = 50;
		int sum1 = k1 + k2;
		
		System.out.println("k1 = " + k1);
		System.out.println("k2 = " + k2);
		System.out.println("sum1 = " + sum1);
	}

}
