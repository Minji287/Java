package greedy_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1789 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long s = Long.parseLong(br.readLine());
		long sum = 0;
		int count = 0;
		
		for(long i = 1; sum <= s; i++) {
			sum += i;
			count++;
		}
		System.out.println(count-1);
	}

}
