package package_2;

import java.util.Scanner;

public class HakjumMain {

	public static void main(String[] args) {
//		클래스를 2개를 만들어서 이름, 국, 영, 수를 입력 받아
//		합계, 평균, 학점 인쇄
		Scanner in = new Scanner(System.in);
		Hakjum h = new Hakjum();
		
		System.out.println("이름을 입력해주세요.");
		h.name = in.nextLine();
		System.out.println("국어 점수를 입력해주세요.");
		h.kor = in.nextInt();
		System.out.println("영어 점수를 입력해주세요.");
		h.eng = in.nextInt();
		System.out.println("수학 점수를 입력해주세요.");
		h.mat = in.nextInt();
		h.show();
	}

}
