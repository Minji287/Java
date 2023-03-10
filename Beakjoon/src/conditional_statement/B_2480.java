package conditional_statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2480 {

	public static void main(String[] args) throws IOException {
		/*
		 * 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다. 
		 * 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
		 * 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
		 * 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다. 
		 * 예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다.
		 * 또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다.
		 * 3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
		 * 3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
		 * 
		 * 첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다. 
		 * 첫째 줄에 게임의 상금을 출력 한다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		int a, b, c;
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		// 만약 모든 변수가 다른 경우
		if(a != b && b != c && a != c) {
			int max;
			if(a > b) {	// 만약 a > b 라면
				if(c > a) {	// c > a > b 라면
					max = c;
				}else { // a > (b, c)
					max = a;
				}
			}
			else { // b > a 라면	
				if(c > b) { // c > b > a 라면
					max = c;
				}else { // b > (a, c)
					max = b;
				}
			}
			System.out.println(max * 100);
		}
		else { // 적어도 한 쌍 이상의 서로 같은 변수가 존재할 경우
			if(a == b && a == c) { // 3개의 변수가 모두 같은 경우
				System.out.println(10000 + a * 1000);
			}else {
				if(a == b || a == c) { // a가 b혹은 c랑만 같은 경우
					System.out.println(1000 + a * 100);
				}else { // b가 c랑 같은 경우
					System.out.println(1000 + b * 100);
				}
			}
		}
	}
}