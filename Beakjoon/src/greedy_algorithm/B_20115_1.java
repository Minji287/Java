package greedy_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_20115_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		double[] drink = new double[n];
		double max = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			drink[i] = Double.parseDouble(st.nextToken());
			if(max < drink[i]) {
				max = drink[i];
			}
		}
		
		double sum = max;
		
		for(int i = 0; i < n; i++) {
			if(drink[i] == max) continue;
			sum += (drink[i] / 2);
		}
		System.out.println(sum);
		
		
	}

}
