package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_10953 {

	public static void main(String[] args) throws IOException {
		/*
		 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. 
		 * A와 B는 콤마(,)로 구분되어 있다. (0 < A, B < 10)
		 * 각 테스트 케이스마다 A+B를 출력한다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), ",");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			sb.append(A+B).append("\n");
		}
		System.out.println(sb);
	}

}
