package package_1;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("몇 명인가요?");
		int number = in.nextInt();
		
		Student[] students = new Student[number];
		
		for(int i = 0; i < number; i++) 
		{
			System.out.println("학생이름?");
			String name = in.next();
			System.out.println("나이?");
			int age = in.nextInt();
			System.out.println("키?");
			int height = in.nextInt();
			System.out.println("몸무게?");
			int weight = in.nextInt();
			System.out.println("학번?");
			String studentID = in.next();
			System.out.println("학년?");
			int grade = in.nextInt();
			System.out.println("학점?");
			double gPA = in.nextDouble();
			students[i] = new Student(name, age, height, weight, studentID, grade, gPA);
		}
		for(int i = 0; i < number; i++) {
			students[i].showStudent();
			System.out.println();
		}
	}

}
