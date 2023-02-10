package package_1;

import java.util.Scanner;

public class P61 {

	public static void main(String[] args) {
		/*
		 * P61
		 * 1) 키보드에서 이름, 국어, 수학 성적을 입력 받아
		 * 이름, 국어, 수학, 합계, 평균을 출력하는 프로그램을 작성하시오.
		 */
		Scanner in = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요.");
		String name = in.nextLine();
		System.out.println("국어 성적을 입력해주세요.");
		int kor = in.nextInt();
		System.out.println("수학 성적을 입력해주세요.");
		int mat = in.nextInt();
		
		int total = kor + mat;
		int avg = total / 2;
		
		System.out.println("이름: " + name);
		System.out.println("국어: " + kor);
		System.out.println("수학: " + mat);
		System.out.println("합계: " + total);
		System.out.println("평균: " + avg);
	}

}
