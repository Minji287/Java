package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B_10773 {

	*public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack stack = new Stack();
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			int num = 0;
			int numBefore = num;
			num = Integer.parseInt(br.readLine());
			if(num != 0) {
				stack.push(num);
				sum += num;
			} else {
				sum -= numBefore;
				stack.pop();
			}
			
		}
		
		if(stack.empty()) {
			System.out.println(0);
		} else {
			System.out.println(sum);
		}
	}

}
