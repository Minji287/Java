package newPackage;

import java.util.Scanner;

public class Sample_6 {

	public static void main(String[] args) {
		Scanner snn = new Scanner(System.in); // 키보드 선언 (객체 생성)
//		Scanner=Class=Api(유틸리티), snn=참조변수
		
		System.out.println("이름 입력하세요."); // 이름 입력
		String name = snn.nextLine(); // 입력 받아서 문자열 변수(name) 이동
		System.out.println("국어 성적 입력하세요."); //국어 성적 입력
		String kor = snn.nextLine(); // 입력 받아서 정수형 변수(kor) 이동
		System.out.println("수학 입력하세요."); // 수학 성적 입력
		String mat = snn.nextLine(); // 입력 받아서 정수형 변수(mat) 이동

		
		int total = Integer.parseInt(kor) + Integer.parseInt(mat);
		int ave = total / 2;
		
		System.out.println("이름: " + name);
		System.out.println("국어: " + kor);
		System.out.println("수학: " + mat);
		System.out.println("합계: " + total);
		System.out.println("평균: " + ave);
	}

}
