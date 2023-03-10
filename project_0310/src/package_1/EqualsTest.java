package package_1;

class Student {
	int studentID;
	String studentName;
	Student(int studentID, String studentName){
		this.studentID = studentID;
		this.studentName = studentName;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
//			Student std = (Student)obj;
//			if(studentID == std.studentID)
				return true;
//			else return false;
		}
		return false;
	}
}
public class EqualsTest {

	public static void main(String[] args) {
		String str1 = new String("test");
		String str2 = new String("test");
		System.out.println(str1 == str2); // == 은 번지수 비교
		System.out.println(str1.equals(str2)); // .equls 는 가지고 있는 값 비교
	}

}
