package package_2;

public class Test_9 {

	public static void main(String[] args) {
		int sum = 0;
		int i;
		for(i = 0;;i++) { // for문 무한반복은 중간 조건 생략 (for(;;)로 조건 없으면 표현 가능)
			if(sum >= 100) {
				break;
			}
			sum += i;
		}
		System.out.println(i);
		System.out.println(sum);
	}

}
