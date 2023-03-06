package package_4;

public class CalculatorTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
//		CompleteCalc completeCalc = new CompleteCalc();
//		System.out.println(completeCalc.add(num1, num2));
//		System.out.println(completeCalc.subtract(num1, num2));
//		System.out.println(completeCalc.times(num1, num2));
//		System.out.println(completeCalc.divide(num1, num2));
//		completeCalc.showInfo();
		Calc calc = new CompleteCalc(); // 업캐스팅 = 업케이스
		CompleteCalc ss = (CompleteCalc)calc; // 다운캐스팅 -> 강제형변환
		System.out.println(calc.add(num1, num2));
		ss.showInfo();
	}

}
