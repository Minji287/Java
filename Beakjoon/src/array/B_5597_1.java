package array;

import java.util.*;

public class B_5597_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean[] arr = new boolean[30];
		
		for(int i = 0; i < 28; i++) {
			int input = in.nextInt();
			arr[input-1] = true;
		}
		for(int j = 0; j < 30; j++) {
			if(!arr[j]) {
				System.out.println(j+1);
			}
		}
	}

}
