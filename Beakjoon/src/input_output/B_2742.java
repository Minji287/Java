package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2742 {

	public static void main(String[] args) throws IOException {
		/*
		 * 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
		 * 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		StringBuilder sb = new StringBuilder();
		for(int i = n; i > 0; i--) {
			sb.append(i + "\n");
		}
		System.out.println(sb);
	}

}
