package input_output;

import java.util.Scanner;

public class B_1000 {

	public static void main(String[] args) {
		/*
		 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
		 * 첫째 줄에 A+B를 출력한다.
		 */
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		System.out.println(A+B);
	}

}
