package package_1.test;

public class Student extends Person implements Job{
	String jobName;
	int studentID;
	
	
	public Student(String name, String address, int studentID) {
		super(name, address);
		this.studentID = studentID;
	}


	@Override
	public void job() {
		System.out.println("이름: " + name);
		System.out.println("학년: " + GRADE);
		System.out.println("학번: " + studentID);
		System.out.println("주소: " + address);
		System.out.println("원하는 직업: " + jobName);
	}
	
}
