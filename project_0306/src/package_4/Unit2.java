package package_4;

abstract class Unit1 {
	int x, y;
	abstract void move(int x, int y);
	void stop() { System.out.println("멈춥니다"); }
}
interface Fightable1 {
	void move(int x, int y); // public abstract가 생략됨
	void attact(Fightable1 f); // interface에 있는 모든 메소드는 abstract
}
interface Fightable2 {
	void move(int x, int y);
	void attact(Fightable2 f);
}
public class Unit2 extends Unit1 implements Fightable1, Fightable2 {

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attact(Fightable1 f) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attact(Fightable2 f) {
		// TODO Auto-generated method stub
		
	}
	
}
