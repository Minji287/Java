package class_result;

public class Page103 {
	int score;
	char grade;
	void Page103Info() {
		if(score >= 90) {
			grade = 'A';
		}
		else if(score >= 80) {
			grade = 'B';
		}
		else if(score >= 70) {
			grade = 'C';
		}
		else if(score >= 60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		System.out.printf("당신의 학점은 %c입니다.%n", grade);	
	}
}
