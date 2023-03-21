package greedy_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_11399 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] minute = new int[n];
		int sum = 0;
		int prev = 0;
		
		for(int i = 0; i < n; i++) {
			minute[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(minute);
		
		for(int j = 0; j < n; j++) {
			sum += prev + minute[j];
			prev += minute[j];
		}
		System.out.println(sum);
	}

}
