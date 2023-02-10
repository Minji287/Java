package package_0207;

import java.util.Scanner;

public class P61 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("이름?");
		String name = scn.nextLine();
		System.out.println("국어?");
		int kor = scn.nextInt();
		System.out.println("수학?");
		int mat = scn.nextInt();
		int total = kor + mat;
		int avg = total / 2;
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("수학 : " + mat);
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + avg);
		

	}

}
