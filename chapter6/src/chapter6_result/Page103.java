package chapter6_result;

public class Page103 {
	int score;
	
	void Page103Info() {
		if(score > 89) {
			System.out.println("당신의 학점은 A 입니다.");
		}else if(score > 79) {
			System.out.println("당신의 학점은 B 입니다.");
		}else if(score > 69) {
			System.out.println("당신의 학점은 C 입니다.");
		}else {
			System.out.println("당신의 학점은 D 입니다.");
		}
	}
}
