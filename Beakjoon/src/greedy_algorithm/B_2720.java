package greedy_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2720 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] coin = {25, 10, 5, 1};
		
		int change;
		StringBuilder sb = new StringBuilder();
		for(int j = 0; j < n; j++) {
			int m = Integer.parseInt(br.readLine());
			for(int i = 0; i < coin.length; i++) {
				change = m / coin[i];
				m %= coin[i];
				sb.append(change).append(' ');
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}

}
