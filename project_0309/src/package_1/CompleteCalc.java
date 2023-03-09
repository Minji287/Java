package package_1;

public class CompleteCalc extends Calculator {

	@Override
	public int multiply(int n1, int n2) {
		return n1*n2;
	}

	@Override
	public int divide(int n1, int n2) {
		if(n2 != 0) { return n1/n2; }
		return ERROR;
	}
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다");
	}

	@Override
	public void description() {
		System.out.println("완벽한 계산기 입니다.");
	}
	
}
