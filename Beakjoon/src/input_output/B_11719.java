package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_11719 {

	public static void main(String[] args) throws IOException {
		/*
		 * 입력 받은 대로 출력하는 프로그램을 작성하시오.
		 * 입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다.
		 * 각 줄은 100글자를 넘지 않으며, 빈 줄이 주어질 수도 있고, 각 줄의 앞 뒤에 공백이 있을 수도 있다.
		 * 입력받은 그대로 출력한다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		
		while((str = br.readLine()) != null) {
			System.out.println(str);
		}
		br.close();
	}

}
