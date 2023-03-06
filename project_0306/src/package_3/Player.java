package package_3;

public abstract class Player {
	abstract void play(int pos);
	abstract void stop();
}
class AudioPlayer extends Player {
	void play(int pos) { }
	void stop() { }
}
class Unit {
	
}
interface Fightable1 { // 본문이 없는 추상 메서드만 인터페이스에 사용가능
	void move(int x, int y);
	void attack(Unit u);
}
interface Fightable2 {
	void move(int x, int y);
	void attack(Unit u);
}
class Fighter implements Fightable1, Fightable2 { // 본문이 없고 선언부만 있기때문에 가능
	public void move(int x, int y) { }
	public void attack(Unit u) { }
}