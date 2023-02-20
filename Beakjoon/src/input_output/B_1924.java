package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1924 {

	public static void main(String[] args) throws IOException {
		/*
		 * 오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까?
		 * 이를 알아내는 프로그램을 작성하시오.
		 * 첫째 줄에 빈 칸을 사이에 두고 x(1 ≤ x ≤ 12)와 y(1 ≤ y ≤ 31)이 주어진다. 
		 * 참고로 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지, 4, 6, 9,
		 * 11월은 30일까지,2월은 28일까지 있다.
		 * 첫째 줄에 x월 y일이 무슨 요일인지에 따라
		 * SUN, MON, TUE, WED, THU, FRI, SAT중 하나를 출력한다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		
		int sum = 0;
		
		for(int i = 0; i < x-1; i++) {
			sum += month[i]; // 1월 1일부터 입력받은 날짜 사이의 일수를 모두 더함
		}
		sum += y;
		System.out.println(days[sum % 7]); // 더한 일수를 7로 나눈 나머지로 요일을 구함
	}

}
