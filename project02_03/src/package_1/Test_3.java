package package_1;

public class Test_3 {

	public static void main(String[] args) {
// 데이터 형 변환
		int a = 33;
		double d = 3.14;
		
		d = a; //자동 형변환 (double -> int)
		System.out.println(d);
		
		int c = 44;
		double f = 3.77;
		
		c = (int)f; // 강제 형변환 (int -> double)
		System.out.println(c);
	}

}
