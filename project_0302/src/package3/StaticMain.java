package package3;

class StaticTest {
	static int width = 200;
	static int height = 120;
	int s1 = 10;
	int s2 = 20;
	static int max(int a, int b) { // static 매서드
//		int sum = s1 + s2 -> 매서드 내에 인스턴스 변수 사용 불가능
		return a > b ? a : b;
	}
}

public class StaticMain {

	public static void main(String[] args) {
		System.out.println(StaticTest.max(20, 30));
		System.out.println(StaticTest.width);
		System.out.println(StaticTest.height);
		StaticTest st = new StaticTest();
		System.out.println(st.s1); // 인스턴스 변수이므로 객체 생성
	}

}
