package package_2;

public class Test_7 {

	public static void main(String[] args) {
//		for문으로 짝수의 합 구하기
//		int sum = 0;
//		for(int i = 0; i <= 100; i++) {
//			sum += i;
//			i++;
//		}
//		System.out.println("1부터 100까지 짝수의 합은 " + sum + " 입니다");
		
		int sum = 0;
		for(int i = 0; i <= 100; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("1부터 100까지 짝수의 합은 " + sum + " 입니다");
	}
	
		

}
