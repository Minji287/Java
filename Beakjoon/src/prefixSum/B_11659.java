package prefixSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_11659 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		long[] sum = new long[n+1];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++) {
			sum[i] = sum[i-1] + Integer.parseInt(st.nextToken());
		}
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int index1 = Integer.parseInt(st.nextToken());
			int index2 = Integer.parseInt(st.nextToken());
			System.out.println(sum[index2] - sum[index1 - 1]);
		}
	}

}
