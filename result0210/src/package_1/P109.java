package package_1;

public class P109 {

	public static void main(String[] args) {
		/*
		 * P109 
		 * 1) 난수를 사용하여 0.0 ~ 1.0 사이의 임의의 수를 구하여 출력하시오.
		 * 2) 난수를 사용하여 1 ~ 10 사이의 임의의 수를 구햐여 출력 하세요.
		 */
		System.out.println("0.0 ~ 1.0 사이의 난수 1개: " + Math.random());
		System.out.println("1 ~ 10 사이의 난수 1개: " + (int)(Math.random() * 10));
	}

}
