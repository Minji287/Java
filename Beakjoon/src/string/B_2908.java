package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2908 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String n1 = st.nextToken();
		String first = n1.substring(0, 1);
		String second = n1.substring(1, 2);
		String third = n1.substring(2, 3);
		int num1 = Integer.parseInt(third + second + first);
		
		String n2 = st.nextToken();
		String first2 = n2.substring(0, 1);
		String second2 = n2.substring(1, 2);
		String third2 = n2.substring(2, 3);
		int num2 = Integer.parseInt(third2 + second2 + first2);
	
		if(num1 > num2) System.out.print(num1);
		else System.out.println(num2);
		
	}

}
