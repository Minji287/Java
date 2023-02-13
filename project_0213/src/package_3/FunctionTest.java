package package_3;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10; // 지역 변수
		int num2 = 30; // 지역 변수
		int sum = addNum(num1,num2);
		System.out.println(sum);
	}
	public static int addNum(int nu1, int nu2) { // 지역 변수(가인수)
		int result = nu1 + nu2;
		return result;
	}

}
