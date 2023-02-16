package chapter6_result;

import java.util.Scanner;

public class Page_108Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Page_108 ss = new Page_108();
		
		System.out.println("월을 입력해주세요.");
		ss.month = in.nextInt();
		ss.Page108Info();
	}

}
