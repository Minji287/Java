package greedy_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_1744 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		int minusCount = 0;
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i] <= 0) {
				minusCount++;
			}
		}
		Arrays.sort(arr);
		
		int sum = 0;
		// 음수 부분(0 포함) - 두개씩 묶어서 더하기
		for(int i = 1; i < minusCount; i += 2) {
			sum += (arr[i-1] * arr[i]);
		}
		
		// 음수(0포함)가 홀수개 일 경우 그냥 더하기
		if(minusCount % 2 == 1) {
			sum += arr[minusCount-1];
		}
		
		// 양수가 홀수개 일 경우 그냥 더하기
		if((n-minusCount) % 2 == 1) {
			sum += arr[minusCount];
		}
		
		// 양수 부분 - 두 개씩 묶어서 더하기
		for(int i = n-1; i > minusCount; i -= 2) {
			int mul = arr[i] * arr[i-1];
			int add = arr[i] + arr[i-1];
			if(mul > add) {
				sum += mul;
			}else {
				sum += add;
			}
		}
		System.out.println(sum);
	}

}
