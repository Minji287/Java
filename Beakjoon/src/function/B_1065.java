package function;

import java.util.Scanner;

public class B_1065 {

	public static void main(String[] args) {
		/*
		 * 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다.
		 * 차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고,
		 * N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
		 * 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
		 * 
		 * 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
		 */
		Scanner in = new Scanner(System.in);
		System.out.println(arithmeticSeq(in.nextInt()));
	}
public static int arithmeticSeq(int n) {
	int count = 0;
	 if(n < 100) {
		 return n;
	 }
	 else {
		 count = 99;
		 
		 for(int i = 100; i <= n; i++) {
			 int hun = i / 100;
			 int ten = (i / 10) % 10;
			 int one = i % 10;
			 
			 if((hun - ten) == (ten - one)) {
				 count++;
			 }
		 }
	 }
	 return count;
	}
}
