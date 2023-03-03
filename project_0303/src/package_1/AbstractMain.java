package package_1;

abstract class Player {
	abstract void play(int pos);
	abstract void stop();
}
class AudioPlayer extends Player {
	void play(int pos) { System.out.println(pos + "회 반복하세요"); }
	void stop() { System.out.println("정지합니다"); }
}
public class AbstractMain {
	public static void main(String[] args) {
		AudioPlayer ap = new AudioPlayer();
		Player ap2 = new AudioPlayer();
		ap.play(50);
		ap.stop();
		ap2.play(30);
		ap2.stop();
	}

}

/*
 * 추상 클래스란?(abstract class)
 * 추상 메서드를 포함한 클래스, 추상 메서드가 하나도 없는 경우도 있을 수 있다.
 * 추상 메서드는 구현코드 없이 매서드의 선언만 있음.
 * 추상 클래스는 상속하기 위해서 만든다.
 * 추상 클래스는 객체생성(인스턴스 화)을 할 수 없다.
 * 추상 클래스는 상속받은 하위 클래스가 자기가 필요한 기능으로 구현하게 된다.
 */
