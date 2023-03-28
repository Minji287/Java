package greedy_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1439 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int count = 0;
		String str1 = "";
		
		for(int i = 0; i < str.length()-1; i++) {
			if(str.charAt(i) != str.charAt(i+1)) {
				str1 = str.substring(i, i+2);
				break;
			}
		}
		for(int i = 0; i < str.length()-1; i++) {
			if(str.substring(i, i+2).equals(str1)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
