package package_1;

import java.util.Scanner;

public class P103 {

	public static void main(String[] args) {
		/*
		 * P103
		 * 1) 키보드에서 성적을 입력 받아 성적이 아래와 같은 조건에 맞게 학점을 출력하시오.
		 * 100 ~ 90 > A, 89 ~ 80 > B, 79 ~ 70 > C, 69 ~ 60 > D, 59 ~ 0 > F 
		 */
		Scanner in = new Scanner(System.in);
		
		System.out.println("성적을 입력해주세요.");
		int score = in.nextInt();
		
		if(score > 89) {
			System.out.println("A");
		} else if(score > 79) {
			System.out.println("B");
		} else if(score > 69) {
			System.out.println("C");
		} else if(score > 59) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
