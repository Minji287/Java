package package_2.Lambda;

@FunctionalInterface
interface MyInterface {
	int calcs(int x, int y, int z);
}

public class Lambda3 {

	public static void main(String[] args) {
		MyInterface inter = (x, y, z) -> {return (x+y)*z;};
		MyInterface inter2 = (x, y, z) -> {return (x+y)/z;};
		try {
			System.out.println(inter.calcs(2, 3, 4));
			System.out.println(inter2.calcs(2, 3, 0));
		} catch (ArithmeticException ae) {
			System.out.println("0으로 나눌 수 없습니다.");
			ae.printStackTrace();
			ae.getMessage();
			System.out.println(ae);
		}
//		System.out.println("calcs((x+y)*z) 결과: " + inter.calcs(2, 3, 4));
	}

}
