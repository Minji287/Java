package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2442_1 {

	public static void main(String[] args) throws IOException {
		/*
		 * 첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., N번째 줄에는 별 2×N-1개를 찍는 문제
		 * 별은 가운데를 기준으로 대칭이어야 한다.
		 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
		 * 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= n; i++) {
			for(int k = 0; k < n-i; k++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i*2-1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
