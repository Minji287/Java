package greedy_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2839 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int times = 0;
		
		while(true) {
			if(n % 5 == 0) {
				times += n / 5;
				System.out.println(times);
				break;
			}else {
				n -= 3;
				times++;
			}
			if(n < 0) {
				System.out.println(-1);
				break;
			}
		}
	}

}
