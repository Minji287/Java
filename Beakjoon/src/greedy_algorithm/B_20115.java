package greedy_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_20115 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		double[] drink = new double[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			drink[i] = Double.parseDouble(st.nextToken());
		}
		Arrays.sort(drink);
		
		double max = drink[n-1];
		double sum = 0;
		
		for(int i = 0; i < n-1; i++) {
			drink[i] /= 2;
			sum += drink[i];
		}
		System.out.println(sum + max);
		
		
	}

}
