package package_2;

import java.util.Scanner;

public class Test_3 {

	public static void main(String[] args) {
//		키보드에서 나이를 입력받는데
//		나이가 8살부터 12살까지는 초등생
//		13살부터 19살까지는 중고생
//		20부터는 일반인입니다
		Scanner scn = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요.");
		int age = scn.nextInt();
		String str = "";
		
		if(age < 13) {
			str = "초등생";
		} else if(age < 20) {
			str = "중고생";
		} else {
			str = "일반인";
		}
		System.out.println(age + "살은 " + str + "입니다.");
	}

}
