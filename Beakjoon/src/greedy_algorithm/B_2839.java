package greedy_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2839 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int times = 0;
		int left = 0;

		for(int i = 0; i < 2; i++) {
			if(n % 5 == 0) {
				times = n / 5;
			} else if(n % 3 == 0) {
				times = n / 3;
			}*
		}
		if(left != 0) System.out.println(-1);
		else System.out.println(times);
	}

}
