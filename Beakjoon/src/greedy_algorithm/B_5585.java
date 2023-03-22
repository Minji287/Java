package greedy_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_5585 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		n = 1000 - n;
		
		int[] coin = {500, 100, 50, 10, 5, 1};
		
		int count = 0;
		
		for(int i = 0; i < coin.length; i++) {
			count += (n / coin[i]);
			n %= coin[i];
		}
		System.out.println(count);
	}

}
