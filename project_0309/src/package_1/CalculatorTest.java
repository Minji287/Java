package package_1;

public class CalculatorTest {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 2;
		Calc calc = new CompleteCalc(); // 업캐스팅
		System.out.println(calc.add(n1, n2));
		CompleteCalc cc = (CompleteCalc) calc; // 다운캐스팅
		cc.showInfo();
		((CompleteCalc) calc).showInfo();
		cc.description();
		calc.description();
		int[] arr2 = {1, 2, 3, 4, 5};
		System.out.println(Calc.total(arr2));
	}

}
