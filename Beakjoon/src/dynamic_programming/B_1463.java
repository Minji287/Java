package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1463 {
	
	static Integer[] dp;

	*public static void main(String[] args) throws IOException {
		/*
		 * 정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
		 * 1. X가 3으로 나누어 떨어지면, 3으로 나눈다.
		 * 2. X가 2로 나누어 떨어지면, 2로 나눈다.
		 * 3. 1을 뺀다.
		 * 정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다.
		 * 연산을 사용하는 횟수의 최솟값을 출력하시오.
		 * 첫째 줄에 1보다 크거나 같고, 10^6보다 작거나 같은 정수 N이 주어진다.
		 * 첫째 줄에 연산을 하는 횟수의 최솟값을 출력한다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		dp = new Integer[n + 1];
		dp[0] = dp[1] = 0;
		
		System.out.println(recur(n));
	}

	static int recur(int n) {
		
		if(dp[n] == null) {
			// 6으로 나눠지는 경우
			if(n % 6 == 0) {
				dp[n] = Math.min(recur(n - 1), Math.min(recur(n / 3), recur(n / 2))) + 1;
			}
			// 3으로만 나눠지는 경우
			else if(n % 3 == 0) {
				dp[n] = Math.min(recur(n / 3), recur(n - 1)) + 1;
			}
			// 2로만 나눠지느 경우
			else if(n % 2 == 0) {
				dp[n] = Math.min(recur(n / 2), recur(n - 1)) + 1;
			}
			// 2와 3으로 나눠지지 않는 경우
			else {
				dp[n] = recur(n - 1) + 1;
			}
		}
		
		return dp[n];
	}
}
