package chapter6_result;

import java.util.Scanner;

public class Page103Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Page103 ss = new Page103();
		
		System.out.println("성적을 입력해주세요.");
		ss.score = in.nextInt();
		
		ss.Page103Info();
	}

}
