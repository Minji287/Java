package package_1;

public class P114 {

	public static void main(String[] args) {
		/*
		 * 	P114
		 * 	*
		 * 	* *
		 *  * * *
		 *  * * * *
		 *  * * * * *
		 *  와 같은 모양이 출력 되는 프로그램 작성(중첩 for 사용)
		 */
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
