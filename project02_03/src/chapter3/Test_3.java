package chapter3;

public class Test_3 {

	public static void main(String[] args) {
//		shift(비트) 연산자
//		<< (왼쪽으로 한번 밀어라, 2로 곱한 결과)
//		>> (오른쪽으로 한번 밀어라, 2로 나눈 결과)
		int a = 3;
		int b;
		
		b = a << 2; // a*2*2 
		System.out.println(b);
		
		a = 12;
		b = a >> 1; // a/2
		System.out.println(b);
		
//		복합 연산자
		int k1 = 5;
		int ss = 20;
		
		ss += k1;
		System.out.println(ss);
		ss = ss + k1;
		System.out.println(ss);
		
//		비트 연산자
		int p1 = k1 & ss; // (십진수->이진수)두 비트가 모두 1일 경우에만 1, 아니면 0 반환
		System.out.println(p1);
		
		int p2 = k1 | ss; // (십진수->이진수)두 비트 중 하나만 1이여도 1이다
		System.out.println(p2);
	}

}
