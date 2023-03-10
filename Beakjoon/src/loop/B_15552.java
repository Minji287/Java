package loop;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class B_15552 {

	public static void main(String[] args) throws IOException {
		/*
		 * Java를 사용하고 있다면, Scanner와 System.out.println 대신
		 * BufferedReader와 BufferedWriter를 사용할 수 있다.
		 * BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
		 * 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 
		 * 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
		 * 
		 * 각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			sb.append(A+B + "\n");
		}
		System.out.println(sb);
	}

}
