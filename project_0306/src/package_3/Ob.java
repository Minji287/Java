package package_3;

public class Ob extends OverAbstract {
	public void turnOn() {
		System.out.println("켭니다");
	}
	public void turnOff() {
		System.out.println("끕니다");
	}
}
// 추상 클래스는 최소 1개 이상의 추상메소드가 있어야한다.
// 단, abstract를 붙이면 객체생성을 할 수 없어서 상속에 의해서만 사용할 수 있다.
