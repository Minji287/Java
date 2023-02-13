package package_1;

import java.util.Scanner;

public class SungJukMain {

	public static void main(String[] args) {
		SungJuk ss = new SungJuk();
		Scanner in = new Scanner(System.in);
		System.out.println("이름을 입력해주세요.");
		ss.name = in.nextLine();
		System.out.println("국어 성적을 입력해주세요.");
		ss.kor = in.nextInt();
		System.out.println("수학 성적을 입력해주세요.");
		ss.mat = in.nextInt();
		
		ss.SungJukInfo();
	}

}
