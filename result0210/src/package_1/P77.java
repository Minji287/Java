package package_1;

public class P77 {

	public static void main(String[] args) {
		/*
		 * P77
		 * 1) 78.34 + 12 = 90 이 되는 명령 작성하기
		 * 2) 12.27 + 34 = 46.27 이 되는 명령 작성하기
		 */
		double x = 12.27 + 34;
		System.out.println("78.3 + 12 = " + (int)(78.3 + 12));
		System.out.printf("12.27 + 34 =  %.2f%n", x);
		System.out.println("12.27 + 34 =  " + Math.round(x*100)/100.0);
	}

}
