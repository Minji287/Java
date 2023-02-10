package package_1;

import java.util.Scanner;

public class Test_7 {

	public static void main(String[] args) {
//		키보드에서 성적을 입력 받아서 성적이 80이상이면 합격이라고 인쇄하고
//		아니면 불합격이라고 인쇄하세요
		Scanner scn = new Scanner(System.in);
		
		System.out.println("성적을 입력해주세요");
		int score = scn.nextInt();
		
		if(score >= 80) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}

}
