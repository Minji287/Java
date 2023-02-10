package package_0207;

public class P120 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		for(;;) {
			sum += i;
			if(i==10) {
				break;
			}
			i++;		
		}
			System.out.println("1부터 10까지의 합은? "+ sum);
	}

}
