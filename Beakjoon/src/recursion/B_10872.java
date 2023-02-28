package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10872 {

	public static void main(String[] args) throws IOException {
		/*
		 * 팩토리얼
		 * 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.
		 * 첫째 줄에 N!을 출력한다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		System.out.print(factorial(n));
	}
	
	static int factorial(int n) {
		if(n <= 1) return 1;
		return n * factorial(n - 1);
	}

}
