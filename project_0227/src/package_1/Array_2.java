package package_1;

import java.util.Arrays;

public class Array_2 {

	public static void main(String[] args) {
		int[][] ss = new int[][]{{11, 22},
					     		 {33, 44},
					     		 {55, 66}
		};
//		ss[0][0] = 11;
//		ss[0][1] = 22;
//		ss[1][0] = 33;
//		ss[1][1] = 44;
//		ss[2][0] = 55;
//		ss[2][1] = 66;
		System.out.println(Arrays.deepToString(ss));
//		for(int i = 0; i < ss.length; i++) {
//			for(int j = 0; j < 2; j++) {
//				System.out.print(ss[i][j] + " ");
//			}
//			System.out.println();
//		}
	}

}
