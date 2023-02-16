package class_result;

public class Page137 {
	int sum = 0;
	float average = 0f;
	int[] score = new int[5];
	void Page137Info() {
		for (int i=0; i<score.length; i++) {
			sum += score[i];
		}
		average = sum / (float)score.length;
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + average);
	}
}
