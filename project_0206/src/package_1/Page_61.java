package package_1;

import java.util.Scanner;

public class Page_61 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("이름?");
		String name = scn.nextLine();
		System.out.println("국어?");
		String kor = scn.nextLine();
		System.out.println("수학?");
		String mat = scn.nextLine();
		
		int total = Integer.parseInt(kor) + Integer.parseInt(mat);
		int avg = total / 2;
		char gg = ' ';
		char pp = ' ';
		
		if(avg >= 90) {
			gg = 'A';
			if(avg >= 95) {
				pp = '+';
			} else {
				pp = '0';
			}
		} else if(avg >= 80) {
			gg = 'B';
			if(avg >= 85) {
				pp = '+';
			} else {
				pp = '0';
			}
		} else if(avg >= 70) {
			gg = 'C';
			if(avg >= 75) {
				pp = '+';
			} else {
				pp = '0';
			}
		} else {
			gg = 'D';
		}
		
		System.out.println("이름: " + name);
		System.out.println("국어: " + kor);
		System.out.println("수학: " + mat);
		System.out.println("합계: " + total);
		System.out.println("평균: " + avg);
		System.out.printf("학점은 %c%c입니다", gg, pp);
	}

}
