package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B_10828 {

	public static void main(String[] args) throws IOException {
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String action = st.nextToken();
			
			if(action.equals("push")) {
				stack.add(Integer.parseInt(st.nextToken()));
			} else if(action.equals("pop")) {
				if(stack.empty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(stack.pop()).append("\n");
				}
			} else if(action.equals("size")) {
				sb.append(stack.size()).append("\n");
			} else if(action.equals("empty")) {
				if(stack.empty()) {
					sb.append(1).append("\n");
				}else {
					sb.append(0).append("\n");
				}
			} else if(action.equals("top")){
				if(stack.empty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(stack.peek()).append("\n");
				}
			}
		}
		System.out.println(sb);
		
	}

}
