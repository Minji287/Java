package greedy_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class B_13164 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> diff = new ArrayList<>();
		
		while(st.hasMoreTokens()) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		for(int i = 0; i < arr.size() - 1; i++) {
			diff.add(arr.get(i+1) - arr.get(i));
		}
		
		Collections.sort(diff);
		
		int sum = 0;
		
		for(int i = 0; i < n-k; i++) {
			sum += diff.get(i);
		}
		System.out.println(sum);
	}

}
