package class_result;

import java.util.Scanner;

public class Page108Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Page108 ss = new Page108();
		System.out.println("월을 입력하세요?");
		ss.month = scn.nextInt();
		ss.page108Info();
	}

}
