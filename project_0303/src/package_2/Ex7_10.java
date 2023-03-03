package package_2;

abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() { /* 현재 위치에 정지 */ }
}
class Marine extends Unit { // 보병
	@Override
	void move(int x, int y) {
		System.out.println("Marine[x=" + x + ", y=" + y + "]");
	}
	void stimPack() { /* 스팀팩을 사용한다 */ }
}
class Tank extends Unit { // 탱크
	@Override
	void move(int x, int y) {
		System.out.println("Tank[x=" + x + ", y=" + y + "]");
	}
	void changeMode() { /* 공격모드를 변환한다 */ }
}
class Dropship extends Unit { // 수송선
	@Override
	void move(int x, int y) {
		System.out.println("Dropship[x=" + x + ", y=" + y + "]");
	}
	void load() { System.out.println("20명을 태웠습니다."); /* 선택된 대상을 태운다. */ }
	void unload() { System.out.println("20명을 내렸습니다."); /* 선택된 대상을 내린다. */ }
}

public class Ex7_10 {

	public static void main(String[] args) {
		Unit[] group = { new Marine(), new Tank(), new Dropship() };
		for(int i = 0; i < group.length; i++) {
			group[i].move(100, 200);
		}
		new Dropship().load();
		new Dropship().unload();
		new Dropship().move(20, 80);
	}

}
