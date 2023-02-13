package package_1;

public class Test_3 {

	public static void main(String[] args) {
		int[][] k1 = new int[2][2];
		k1[0][0] = 90;
		k1[0][1] = 77;
		k1[1][0] = 80;
		k1[1][1] = 99;
		for(int i = 0; i < k1.length; i++) {
			for(int j = 0; j < k1.length; j++) {
				System.out.print(k1[i][j] + " ");
			}
			System.out.println();
		}
	}

}
