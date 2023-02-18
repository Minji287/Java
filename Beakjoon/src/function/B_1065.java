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
		arithmeticSeq();
	}
public static void arithmeticSeq() {
	int cycle1 = 0;
	int cycle2 = 0;
	int count = 0;
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
//		n / 10 = n의 나머지 자리수
//		n % 10 = n의 1의 자리수
		
//		ex) 123
//		n % 10 == 3 첫째자리수
//		n / 10 == 12  1의 자리수 없애기
//		((n / 10) % 10) == 2 둘째자리수
	if(n <= 10) {
		count++;
	}
	else if(n < 100) { // 두자리수
		count = 10;
		for(int j = 11; j <= n; j++) {
			cycle1 = (j % 10) - (j / 10);
//			System.out.println(cycle1);
			if(cycle1 == -1 || cycle1 == 0 || cycle1 == 1) {
				count++;
			}
		}
	}

//	세자리수 수정해야함
	*
	else if(n < 1000) { // 세자리수
		count = 10;
		for(int k = 100; k <= n; k++) {
			cycle1 = (k % 10) - ((k / 10) % 10); // 첫째 둘째 공차
	//		System.out.println(cycle1);
			cycle2 = ((k / 10) % 10) - (((k / 10) % 10) % 10); // 둘째 셋째 공차
	//		System.out.println(cycle2);
			if(cycle1 == cycle2) {
				count++;
			}
		}
	}
	System.out.println(count);
}
}
