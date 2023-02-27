package package_1;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Student mm = new Student(); // public Student() {} 기본 생성자 필요,
									// public Student(int kor)는 매개변수가 없어서 안됌
		int kk;
		System.out.println("이름?");
		mm.name = scn.nextLine();
		System.out.println("국어?");
		
		Student mm2 = new Student(scn.nextInt());
		
		System.out.println("수학?");
		mm.mat = scn.nextInt();
		mm.show();
	}

}
