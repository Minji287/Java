package loop;

import java.util.Scanner;

public class B_11022 {

	public static void main(String[] args) {
		/*
		 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		 * 각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다.
		 * x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
		 * 
		 * Case #1: 1 + 1 = 2
		 * Case #2: 2 + 3 = 5
		 * Case #3: 3 + 4 = 7
		 * Case #4: 9 + 8 = 17
		 * Case #5: 5 + 2 = 7
		 */
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println("Case #" + (i+1) + ": "
					+ a + " + " + b + " = " + (a+b));
		}
	}

}
