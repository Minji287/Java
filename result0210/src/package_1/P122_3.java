package package_1;

public class P122_3 {

	public static void main(String[] args) {
		/*
		 * P122
		 * break, continue, break Loop1, continue Loop1 연습 프로그램 작성
		 * p122_1 => break
		 * p122_2 => continue
		 * p122_3 => break Loop1
		 * p122_4 => continue Loop1
		 * 
		 * 2 * 1 = 2
		 * 2 * 2 = 6
		 * 2 * 3 = 4
		 * 2 * 4 = 8
		 */
		Loop1: for(int i = 2; i <= 9; i++) {
				for(int j = 1; j <= 9 ; j++) {
					if(j == 5) {
						break Loop1;
					}
					System.out.println(i + "*" + j + "=" + i*j);
				}
				System.out.println();
			}
	}
	
}
