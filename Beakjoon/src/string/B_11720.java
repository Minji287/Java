package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_11720 {

	public static void main(String[] args) throws IOException {
		/*
		 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
		 * 입력으로 주어진 숫자 N개의 합을 출력한다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		
		int sum = 0;
		
		for(byte val : br.readLine().getBytes()) {
			sum += (val - '0');
		}
		System.out.print(sum);
	}

}
