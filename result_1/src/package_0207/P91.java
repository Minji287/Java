package package_0207;

import java.util.Scanner;

public class P91 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("성적 입력?");
		int ss = sn.nextInt();
		String result = (ss>=70) ? "합격" : "불합격";
		System.out.println("성적 : " + ss);
		System.out.println("결과 : " + result);

	}

}
