package package_1;

import java.util.Scanner;

public class Test_4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("성적을 입력하세요");
		int score = scn.nextInt();
		
		if(score >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}

}
