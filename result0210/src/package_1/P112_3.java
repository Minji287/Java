package package_1;

public class P112_3 {

	public static void main(String[] args) {
		/*
		 * P112-3
		 * 1부터 100까지에서 홀수의 합
		 */
		int sum = 0;
		for(int i = 0; i <= 100; i++) {
			if(i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
