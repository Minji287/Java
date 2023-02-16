package chapter6_result;

public class MyMathMain {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		
		long result = mm.add(5L, 3L);
		long result1 = mm.subtract(5L, 3L);
		long result2 = mm.multiply(5L, 3L);
		double result3 = mm.divide(5L, 3L);
		
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
