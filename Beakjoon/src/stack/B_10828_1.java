package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B_10828_1 {

	public static void main(String[] args) throws IOException {
		Stack<Integer> stack = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String action = st.nextToken();
			
			switch(action) {
			case "push": stack.add(Integer.parseInt(st.nextToken())); 
			break;			
			case "size": sb.append(stack.size()).append("\n");
			break;
			case "top": if(stack.empty()) {
							sb.append(-1).append("\n");
						} else {
							sb.append(stack.peek()).append("\n");
						}
			break;
			case "pop": if(stack.empty()) {
							sb.append(-1).append("\n");
						}
						else {
							sb.append(stack.pop()).append("\n");
						}
			break;
			case "empty": if(stack.empty()) {
							sb.append(1).append("\n");
						}else {
							sb.append(0).append("\n");
						}
			break;
			}
		}
		System.out.println(sb);
		
	}

}
