package package_0207;

import java.util.Scanner;

public class P103 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in); 
		System.out.println("성적은?");
		int ss = sn.nextInt();
		String grade;
		if(ss>90) {
			grade = "A";
		}
		else if(ss>80) {
			grade = "B";
		}
		else if(ss>70) {
			grade = "C";
		}
		else if(ss>60) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		System.out.println("성적 : " + ss);
		System.out.println("학점 : " + grade);
		
	}

}
