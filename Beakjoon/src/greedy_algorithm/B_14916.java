package greedy_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_14916 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		
		if(n % 5 == 0) {
			count = n / 5;
		} else if(n % 3 == 0) {
			count = n / 3;
		} else {
			n = n - 5;
			if(n % 3 == 0) {
				n = n / 3;
			}
		}*
		System.out.println(count);
	}

}
