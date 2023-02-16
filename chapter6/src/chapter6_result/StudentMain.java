package chapter6_result;

public class StudentMain {

	public static void main(String[] args) {
		Student studentLee = new Student();
		Student studentKim = new Student();
		
		studentLee.studentName = "이순신";
		studentLee.grade = 2;
		studentLee.studentID = 2023001;
		studentLee.address = "인천시 미추홀구 주안동";
		
		studentKim.studentName = "김유신";
		studentKim.grade = 1;
		studentKim.studentID = 2023077;
		studentKim.address = "서울시 종로구 인사동";
		
		studentLee.showStudentInfo();
		System.out.println();
		studentKim.showStudentInfo();
		System.out.println();
		System.out.println("힙메모리 주소: " + studentLee);
		System.out.println("힙메모리 주소: " + studentKim);
	}

}
