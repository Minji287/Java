package chapter6_result;

import java.util.Scanner;

public class MyMathMain {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		MyMath mm = new MyMath();
		
		long x = 324534L;
		long y = 123156L;
		long result = 0;
		long result1 = 0;
		long result2 = 0;
		double result3 = 0;
		
		result = mm.add(x, y);
		System.out.println(result);
		result1 = mm.subtract(x, y);
		System.out.println(result1);
		result2 = mm.multiply(x, y);
		System.out.println(result2);
		result3 = mm.divide(x, y);
		System.out.println(result3);
	}

}
