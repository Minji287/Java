package package_2;

public class Test_8 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		while(true) { // 무한반복
			if(sum > 100) {
				break;
			}
			sum += i;
			i++;
		}
		System.out.println("sum= " + sum);
		System.out.println("i= " + i);
	}

}
