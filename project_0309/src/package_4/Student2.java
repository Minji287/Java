package package_4;

import java.util.ArrayList;

public class Student2 {
	private int studentID;
	private String studentName;
	private ArrayList<Subject> subjectList;
	
	public Student2(int studentID, String studentName) { // 학생의 정보 입력
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) { // 학생의 정보(점수) 추가
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		
		subjectList.add(subject);
	}
	public void showSubjectInfo() {
		int total = 0;
		for(Subject subject : subjectList) {
			System.out.println("학생 " + studentName + "님의 " + subject.getName() +
					" 과목의 성적은 " + subject.getScorePoint() + "점 입니다.");
			total += subject.getScorePoint();
		}
		System.out.println("학생 " + studentName + "님의 총점은 " + total +
				"점입니다.");
	}
}
