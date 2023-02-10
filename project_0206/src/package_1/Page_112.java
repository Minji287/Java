package package_1;

public class Page_112 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i <= 20; i++) {
			if(i % 3 == 0) {
				sum += i; // sum = sum + i;
			}
		}
		System.out.println("1부터 20까지 3의 배수 합은? " + sum);
	}

}
