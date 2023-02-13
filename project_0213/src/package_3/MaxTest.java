package package_3;

public class MaxTest {

	public static void main(String[] args) {
		int a = 55;
		int b = 77;
		int sum = maxNum(a, b);
		System.out.println("최대 값: " + sum);
	}
public static int maxNum(int max, int min) { // = method(명령어 집합)
	int num = max > min ? max : min;
	return num;
}
}
