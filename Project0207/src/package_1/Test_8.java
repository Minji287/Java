package package_1;

public class Test_8 {

	public static void main(String[] args) {
//		x의 값이 5보다 더 크면 sum에 넣고 아니면 20을 sum에 넣어라
//		그리고 x와 sum을 인쇄하시오
		int x = 7;
		int sum = 0;
		
//		if(x > 5) {
//			sum = 5;
//		} else {
//			sum = 20;
//		}
		
//		삼항 연산자
		sum = (x > 5) ? 5 : 20;
		
		System.out.println(x);
		System.out.println(sum);
	}

}
