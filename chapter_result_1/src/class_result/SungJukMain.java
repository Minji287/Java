package class_result;

import java.util.Scanner;

public class SungJukMain {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		SungJuk sJ = new SungJuk();
		System.out.println("이름?");
		sJ.name = scn.nextLine();
		System.out.println("국어?");
		sJ.kor = scn.nextInt();
		System.out.println("수학?");
		sJ.mat = scn.nextInt();
		System.out.println("영어?");
		sJ.eng = scn.nextInt();
		System.out.println("주소?");
		sJ.address = scn.next();
		scn.close();
		sJ.SungJukInfo();		
	}
}
