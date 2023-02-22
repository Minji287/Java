package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10992 {

	public static void main(String[] args) throws IOException {
		/*
		 * 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
		 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
		 * 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
		 * ex) n = 3
		 *   *
		 *  * *
		 * *****
		 */
		*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k < i+1; k++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
