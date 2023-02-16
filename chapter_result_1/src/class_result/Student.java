package class_result;

public class Student {
	int studentID;
	String studentName;
	String address; 
	public void showStudentInfo(){
		System.out.printf("이름은 %s이고 학번은 %d이며 주소는 %s 입니다.",studentName,studentID,address);
	}
}
