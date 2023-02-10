package package_1;

public class P120 {

	public static void main(String[] args) {
		/*
		 * P120
		 * for( ; ; ) 무한 루프를 사용하여 1부터 100까지 합을 구해 출력히세요
		 */
		int i = 0;
		int sum = 0;
		for(;;) {
			sum += i++;
			if(i > 100) {
				break;
			}
		}
		System.out.println(sum);
	}

}
