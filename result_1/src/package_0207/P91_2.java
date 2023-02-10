package package_0207;

import java.util.Scanner;

public class P91_2 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("성적 입력?");
		int ss = sn.nextInt();
		String result;
		if(ss>=70) {
			result = "합격";
		}
		else {
			result = "불합격";
		}
		System.out.println("성적 : " + ss);
		System.out.println("결과 : " + result);

	}

}
