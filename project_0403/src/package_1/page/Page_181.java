package package_1.page;

public class Page_181 {
	int a = 80;
	static int b = 90;
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		System.out.println(mm.add(50L, 70L));
		Page_181 p181 = new Page_181();
		System.out.println(p181.a + Page_181.b);
		System.out.println(mm.c + MyMath.d);
	}
}
	class MyMath {
		int c = 40;
		static int d = 30;
		long add(long a, long b) {
			long result = a+b;
			return result;
		}
	}
