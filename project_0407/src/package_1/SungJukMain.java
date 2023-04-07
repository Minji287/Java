package package_1;

import java.util.Scanner;

public class SungJukMain {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("이름, 국어, 영어, 수학 성적을 순서대로 입력해주세요.");

		SungJuk info = new SungJuk();
		
		info.name = in.nextLine();
		info.kor = in.nextInt();
		info.eng = in.nextInt();
		info.mat = in.nextInt();
		
		info.Result();
	}

}
