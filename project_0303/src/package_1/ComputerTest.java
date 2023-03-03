package package_1;

abstract class Computer {
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다");
	}
}
abstract class NoteBook extends Computer {
	@Override
	public void display() {
		System.out.println("NoteBook display");
	}
}
class MyNoteBook extends NoteBook {
	@Override
	public void typing() {
		System.out.println("MyNoteBook typing");
	}
}
class DeskTop extends Computer {
	@Override
	public void display() {
		System.out.println("DeskTop display");
	}
	@Override
	public void typing() {
		System.out.println("DeskTop typing");
	}
}
abstract class OverAbstract {
	public void turnOn7() {
		System.out.println("전원을 켭니다");
	}
	public void turnOff7() {
		System.out.println("전원을 끕니다");
	}
}
class Aclass extends OverAbstract {
	public void turnOn7() {
		System.out.println("전원을 1 켭니다");
	}
}
public class ComputerTest {
	public static void main(String[] args) {
		Computer c2 = new DeskTop(); // 업캐스팅(다향성)
		Computer c4 = new MyNoteBook();
		c2.display();
		c4.display();
		c2.turnOn();
		c4.turnOff();
	}
}
