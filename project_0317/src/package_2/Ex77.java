package package_2;

@FunctionalInterface // 붙여주면 조건을 체크해준다.
interface MyFunction{
	// public abstract int max(int a, int b);
	int max(int a, int b);
	// public abstract int max2(int a, int b);
	// 함수형 인터페이스에는 추상 메서드가 한개만 있어야 한다.
	
}

public class Ex77 {
//	Ex77() {}
	public static void main(String[] args) {
		// Object (a, b) -> a > b ? a : b; 람다식, 익명객체
		MyFunction f = (a, b) -> a > b ? a : b;
		
		int value = f.max(3, 5);
		System.out.println("value = " + value);
		}

//	public int max(int a, int b) {
//		return a > b ? a : b;
//	}
	
}
