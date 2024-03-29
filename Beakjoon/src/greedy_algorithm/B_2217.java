package greedy_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_2217 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] rope = new int[n];
		
		for(int i = 0; i < n; i++) {
			rope[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(rope);
		
		int max = rope[n-1];
		
		for(int i = 0; i < n; i++) {
			max = Math.max(max, rope[i] * (n - i));
		}
		
		System.out.println(max);
		
	}

}
