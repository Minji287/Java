package package_2;

public class P154 {

	public static void main(String[] args) {
		int[] arr[];
		
		int[] arr1 = {1, 2, 3};
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1); // 힙메모리 주소
		
		int[] arr2 = new int[5];
		
		int[][] arr3 = {
				{ 5, 5, 5, 5, 5},
				{ 10, 10, 10},
				{ 20, 20, 20, 20},
				{ 30, 30} // **
		};
		System.out.println(arr3.length); // 4
		System.out.println(arr3[3].length); // 2
	}

}
