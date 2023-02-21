package package_1;

import java.util.Scanner;

public class SungJukMain {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		SungJuk sj = new SungJuk();
		System.out.println("국어 성적을 입력해주세요.");
		sj.kor = in.nextInt();
		System.out.println("수학 성적을 입력해주세요.");
		sj.mat = in.nextInt();
		in.close();
		sj.showInfo();
	}

}
