package greedy_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B_1026 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			a.add(Integer.parseInt(st.nextToken()));
			b.add(Integer.parseInt(st2.nextToken()));
		}
		
		a.sort(Comparator.naturalOrder());
		b.sort(Comparator.reverseOrder());
		
		int sum = 0;
		
		for(int i = 0; i < a.size(); i++) {
			int num1 = a.get(i);
			int num2 = b.get(i);
			sum += (num1 * num2);
		}
		System.out.println(sum);
	}

}
