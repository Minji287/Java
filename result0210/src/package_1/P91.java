package package_1;

import java.util.Scanner;

public class P91 {

	public static void main(String[] args) {
		/*
		 * P91
		 * 1) 키보드에서 성적을 입력 받아 성적이 70점 이상이면 "합격"을 아니면 "불합격"을 kk 변수에 저장하고
		 * 입력된 점수와 kk 변수의 내용을 출력하는 프로그램을 작성하시오.(삼항연산자 사용)
		 */
		Scanner in = new Scanner(System.in);
		
		System.out.println("성적을 입력해주세요.");
		int kk = in.nextInt();
		String ans;
		
		ans = kk >= 70 ? "합격" : "불합격";
		System.out.println(ans);
	}

}
