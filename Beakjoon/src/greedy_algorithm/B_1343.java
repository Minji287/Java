package greedy_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1343 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String result = "";
		String A = "AAAA", B = "BB";
		
		str = str.replaceAll("XXXX", A);
		result = str.replaceAll("XX", B);
		
		if(result.contains("X")) {
			result = "-1";
		}
		System.out.println(result);
	}

}
