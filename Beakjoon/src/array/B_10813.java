package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_10813 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int n1 = Integer.parseInt(st.nextToken()) - 1;
			int n2 = Integer.parseInt(st.nextToken()) - 1;
			int temp = arr[n1];
			arr[n1] = arr[n2];
			arr[n2] = temp;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
