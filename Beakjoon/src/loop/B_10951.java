package loop;

import java.util.Scanner;

public class B_10951 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		for(;;) {
			int a = in.nextInt();
			int b = in.nextInt();
			if(a == 0 && b == 0) {
				break;
			}
			System.out.println(a+b);
		}
	}

}
