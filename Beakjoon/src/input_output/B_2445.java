package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2445 {

	public static void main(String[] args) throws IOException {
		/*
		 * 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
		 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
		 * 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
		 * 
		 * *        *
		 * **      **
		 * ***    ***
		 * ****  ****
		 * **********
		 * ****  ****
		 * ***    ***
		 * **      **
		 * *        *
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
 
                System.out.print("*");
            }
 
            System.out.println();
        }
        for (int j = n - 1; j >= 1; j--) {
            for (int k = 1; k <= j; k++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (n - j); k++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= j; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}

}
