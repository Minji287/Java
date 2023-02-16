package chapter6_result;

public class Page151 {
	int[][] score = new int[5][3];
	int korTotal;
	int engTotal;
	int matTotal;
	
	void Page151Info() {
		System.out.println("번호  국어  영어   수학  총점  평균");
		System.out.println("===========================");
		
		for(int i = 0; i < score.length; i++) {
			int sum = 0;
			float avg = 0.0f;
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			matTotal += score[i][2];
			System.out.printf("%3d", i+1);
//			%nd  이렇게 사용하게 되면 n만큼 칸으로 오른쪽 정렬해서 출력해준다.
			
			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%5d", score[i][j]);
			}
			avg = sum / (float)score[i].length;
			System.out.printf("%5d %5.1f%n", sum, avg);
		}
		System.out.println("===========================");
		System.out.printf("총점:%4d %4d %4d%n", korTotal, engTotal, matTotal);
		
	}
}
