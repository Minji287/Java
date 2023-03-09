package package_2;

class AAA2{
	int i = 100;
	BBB2 b = new BBB2();
	private int t1;
	public int getT1() {
		return t1;
	}

	public void setT1(int t1) {
		this.t1 = t1;
	}

	class BBB2{ // BBB2는 AAA2의 내부 클래스
		void method() {
//			AAA a = new AAA();
//			System.out.println(a.i);
			System.out.println(i); // 객체생성 없이 사용 가능
		}
	}
}
public class InnerTest2 {

	public static void main(String[] args) {
//		BBB2 b = new BBB2();
		AAA2 a = new AAA2();
		a.b.method();
		a.setT1(256);
		System.out.println(a.getT1());
	}

}
