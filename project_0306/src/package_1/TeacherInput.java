package package_1;

import java.util.Scanner;

public class TeacherInput {
	void stIn() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요.");
		Teacher2 teacher = new Teacher2();
		teacher.setName(in.nextLine());
		System.out.println("나이를 입력해주세요.");
		teacher.setAge(in.nextInt());
		System.out.println("키를 입력해주세요.");
		teacher.setHeight(in.nextInt());
		System.out.println("몸무게를 입력해주세요.");
		teacher.setWeight(in.nextInt());
		System.out.println("교번을 입력해주세요.");
		teacher.setTeacherID(in.next());
		System.out.println("월급을 입력해주세요.");
		teacher.setMonthSalary(in.nextInt());
		teacher.info();
	}
}
