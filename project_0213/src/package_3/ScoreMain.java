package package_3;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Score ss = new Score();
		System.out.println("이름을 입력해주세요.");
		ss.name = in.nextLine();
		System.out.println("국어 성적을 입력해주세요.");
		ss.kor = in.nextInt();
		System.out.println("수학 성적을 입력해주세요.");
		ss.mat = in.nextInt();
		System.out.println("영어 성적을 입력해주세요.");
		ss.eng = in.nextInt();
		ss.info();
	}

}
