package package_2;

public class Test_2 {

	public static void main(String[] args) {
//		1부터 200사이의 짝수의 합을 인쇄하시오
		int sum = 0;
		for(int i = 0; i <= 200; i++) {
			if(i % 2 == 0)
			{
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
