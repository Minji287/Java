package package_2;

import java.util.Scanner;

public class Test_1 {

	public static void main(String[] args) {
		int age = 0;
		int charge = 0;
		String status = "";
		Scanner scn = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요.");
		age = scn.nextInt();
		
		if(age <= 7) {
			charge = 1000;
			status = "미취득생";
		} else if(age <= 13) {
			charge = 2000;
			status = "초등학생";
		} else if(age <= 19) {
			charge = 2500;
			status = "중.고등학생";
		} else {
			charge = 3000;
			status = "일반인";
		}
		System.out.println("감사합니다.\n입장료는 " + charge + "이며 당신은 " + status + "입니다");		
	}

}
