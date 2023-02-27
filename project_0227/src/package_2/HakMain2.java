package package_2;

import java.util.Scanner;

public class HakMain2 {
	String name;
	int kor;
	int eng;
	int mat;
	void show() {
		int total = kor + eng + mat;
		int avg = total / 3;
		System.out.println("이름: " + name);
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + mat);
		System.out.println("합계: " + total);
		System.out.println("평균: " + avg);
	}

	public static void main(String[] args) {
//		클래스를 2개를 만들어서 이름, 국, 영, 수를 입력 받아
//		합계, 평균 인쇄
		Scanner in = new Scanner(System.in);
		HakMain2 h = new HakMain2();
		
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
