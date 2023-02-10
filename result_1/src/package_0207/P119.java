package package_0207;

public class P119 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		while(true) {
			sum += i;
			if(i==10) {
				break;
			}
			i++;		
		}
			System.out.println("1부터 10까지의 합은? "+ sum);
	}

}
