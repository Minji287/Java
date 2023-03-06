package package_1;

import java.util.Scanner;

public class StudentInput {
	void stIn() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요.");
		Student2 student = new Student2();
		student.setName(in.nextLine());
		System.out.println("나이를 입력해주세요.");
		student.setAge(in.nextInt());
		System.out.println("키를 입력해주세요.");
		student.setHeight(in.nextInt());
		System.out.println("몸무게를 입력해주세요.");
		student.setWeight(in.nextInt());
		System.out.println("학번을 입력해주세요.");
		student.setStudentID(in.next());
		System.out.println("학년을 입력해주세요.");
		student.setGrade(in.nextInt());
		student.info();
	}
}
