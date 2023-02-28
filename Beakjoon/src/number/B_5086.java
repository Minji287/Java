package number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_5086 {

	public static void main(String[] args) throws IOException {
		/*
		 * 두 수가 주어졌을 때, 다음 3가지 중 어떤 관계인지 구하는 프로그램을 작성하시오.
		 * 첫 번째 숫자가 두 번째 숫자의 약수이다.
		 * 첫 번째 숫자가 두 번째 숫자의 배수이다.
		 * 첫 번째 숫자가 두 번째 숫자의 약수와 배수 모두 아니다.
		 * 마지막 줄에는 0이 2개 주어진다. 두 수가 같은 경우는 없다.
		 * 각 테스트 케이스마다 첫 번째 숫자가 두 번째 숫자의 약수라면 factor를, 
		 * 배수라면 multiple을, 둘 다 아니라면 neither를 출력한다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for(;;) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			
			if(n1 == 0 & n2 == 0) break;
			
			if(n2 % n1 == 0) sb.append("factor\n");
			else if(n1 % n2 == 0) sb.append("multiple\n");
			else sb.append("neither\n");
		}
		System.out.print(sb);
	}

}
