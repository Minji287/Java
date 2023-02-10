package package_1;

import java.util.Scanner;

public class Page_98 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("값을 입력하세요");
		
		int kr = Integer.parseInt(scn.nextLine());
		
		if(kr > 30) {
			System.out.println("예");
		}
		else {
			System.out.println("아니요");
		}
	}

}
