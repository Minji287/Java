package chapter3;

public class Ex3_5 {

	public static void main(String[] args) {
//		형변환 연산자
		double d = 85.4;
		int score = (int) d; // 강제 형 변환
//					(타입) 피연산자
		System.out.println("score=" + score);
		System.out.println("d=" + d + "\n");
		
		int a =77;
		double b = 77.5;
		b = a;
		
		System.out.println(a);
		System.out.println(b);
	}

}
