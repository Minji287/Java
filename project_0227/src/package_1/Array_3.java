package package_1;

import java.util.Arrays;

public class Array_3 {

	public static void main(String[] args) {
		int[] ss1 = new int[]{11, 22, 33, 44, 55};
		int[][] ss2 = new int[][]{{11, 22},
    		 {33, 44},
    		 {55, 66}
};
		System.out.println(Arrays.toString(ss1)); // 1차원
		System.out.println(Arrays.deepToString(ss2)); // 2차원
	}

}
