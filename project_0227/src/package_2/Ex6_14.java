package package_2;

public class Ex6_14 {
	static { // 1. 클래스 초기화 블럭이 가장 먼저 수행 그다음 메인으로
		System.out.println("static { }");
	}
	
	{
		System.out.println("{ }"); // 3. 인스턴스 초기화 블럭
	} 								// 인스턴스가 생성될 때 마다 수행
	public Ex6_14() {
		System.out.println("생성자"); // 5.
	}
	
	public static void main(String[] args) { // 2.
		System.out.println("Ex6_14 bt = new Ex6_14(); ");
		Ex6_14 bt = new Ex6_14(); // 인스턴스 생성 -> 4.
		
		System.out.println("Ex6_14 bt2 = new Ex6_14(); ");
		Ex6_14 bt2 = new Ex6_14();
	}

}
