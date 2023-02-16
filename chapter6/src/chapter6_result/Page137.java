package chapter6_result;

public class Page137 {
	int sum;
	float avg;
	int[] score = new int[5];
	
	void Page137Info() {
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		avg = sum / (float)score.length;
		
		System.out.println("총합: " + sum);
		System.out.println("평균: " + avg);
	}
}
