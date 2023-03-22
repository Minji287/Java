package greedy_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10162 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double sec = Double.parseDouble(br.readLine());
		double[] time = {5*60, 1*60, 10};
		
		StringBuilder sb = new StringBuilder();
		
		double count = 0;
		double left = 0;
		
		for(int i = 0; i < time.length; i++) {
			count = sec / time[i];
			sec = sec % time[i];
			left = sec;
			
			int noDec = (int)count; 
			
			sb.append(noDec).append(' ');
		}
		if(left != 0) {
			sb.setLength(0);
			sb.append(-1);
		}
		System.out.println(sb);
	}

}
