package package_1;

import java.util.Scanner;

public class Main {
	String name;
	int kor;
	int mat;
	final double PI = 3.14; // 상수형 변수(상수 = 변하지않는 수)
//	public Main() {} -> 기본생성자(참조변수를 만들때 컴파일러가 만들어줌)
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Main mm = new Main();
		System.out.println("이름?");
		mm.name = scn.nextLine();
		System.out.println("국어?");
		mm.kor = scn.nextInt();
		System.out.println("수학?");
		mm.mat = scn.nextInt();
		mm.show();
	}
	void show() {
		int ss = (int)(PI * 5); // 강제 형변환
		double ss2 = PI * 5;
		double ss3 = 3254; // 자동 형변환
		int total;
		int avg;
		total = kor + mat;
		avg = total / 2;
		
		System.out.println("이름: " + name);
		System.out.println("국어: " + kor);
		System.out.println("수학: " + mat);
		System.out.println("합계: " + total);
		System.out.println("평균: " + avg);
	}

}
