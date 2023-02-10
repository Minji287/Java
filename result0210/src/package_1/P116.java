package package_1;

public class P116 {

	public static void main(String[] args) {
		/*
		 * P116
		 * while 문을 사용하여 1부터 10까지 합을 다음과 같이 출력되도록 프로그램을 작성(printf사용)
		 * 0 - 0
		 * 1 - 1
		 * 2 - 3
		 * .  .  .
		 * 10 - 55
		 */
		int i = 0;
		int sum = 0;
		while(i <= 10) {
			System.out.printf("%d - %d\n", i, sum);
			sum += ++i;
		}
	}

}
