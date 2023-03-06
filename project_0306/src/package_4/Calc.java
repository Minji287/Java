package package_4;

public interface Calc {
	double PI = 3.14; // final double PI = 3.14;
	int error = 999999999; // 모든게 public abstract
	int add(int num1, int num2); // 추상 메서드
	int subtract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
}
