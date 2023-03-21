package greedy_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_11047 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] coin = new int[n];
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		for(int j = n-1; j >= 0; j--) {
			count += k / coin[j];
			k %= coin[j];
		}
		System.out.println(count);
	}

}