package package_2;

import java.util.Arrays;

public class Test_1 {

	public static void main(String[] args) {
		int[] k1 = {15, 25, 35, 40, 55};
		k1[2] = 77;
		char[] k2 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K'};
//		System.out.println(k1[0]);
//		System.out.println(k1[1]);
//		System.out.println(k1[2]);
//		System.out.println(k1[3]);
//		System.out.println(k1[4]);
		for(int i = 0; i < k1.length; i++) {
			System.out.print(k1[i] + ", ");
		}
		System.out.println();
		for(int i = 0; i < k2.length; i++) {
			System.out.print(k2[i] + ", ");
		}
		System.out.println();
		System.out.println(k1);
		System.out.println(k2);
		System.out.println(Arrays.toString(k1));
		System.out.println(Arrays.toString(k2));
	}

}
