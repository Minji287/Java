package chapter3;

public class Ex3_17 {

	public static void main(String[] args) {
//		삼항연산자
		int x;
		int absX;
		
		x = 10;
		
		absX = x >= 0 ? x : -x;
		System.out.println(absX);
		
		if(x >= 10) {
			absX = x;
			System.out.println("absX = " + absX);
		}
		else {
			absX = -x;
			System.out.println("absX = " + absX);
		}
	}

}
