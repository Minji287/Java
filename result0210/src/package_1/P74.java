package package_1;

public class P74 {

	public static void main(String[] args) {
		/*
		 * P74
		 * 1)  j=20; i=10; 일때 j = i++;  문장을 실행한 후의 j, i의 값을 인쇄하시오.
		 * 2) k1=20; k2=30 일때 k1 = ++k2; 문장을 실행한 후의 k1, k2의 값을 인쇄하시오
		 */
		int j = 20;
		int i = 10;
		j = i++;
		System.out.println(j);
		System.out.println(i);
		
		int k1 = 20;
		int k2 = 30;
		k1 = ++k2;
		System.out.println(k1);
		System.out.println(k2);
	}

}
