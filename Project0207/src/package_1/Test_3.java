package package_1;

public class Test_3 {

	public static void main(String[] args) {
//		do-while문
		int i = 0;
		int sum = 0;
		
		do {
			sum += i;
			i++;
		} while(i <= 100);
		System.out.println("1부터 100까지의 합은 " + sum + "입니다");
	}

}
