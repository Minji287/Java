package package_1;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}
class Human extends Animal {
//	@override
	public void move() {
		System.out.println("이 두 발로 걷습니다.");
	}
	public String toString() {
		return "사람";
	}
}
class Tiger extends Animal {
//	@override
	public void move() {
		System.out.println("가 네 발로 뜁니다.");
	}
	public String toString() {
		return "호랑이";
	}
}
class Eagle extends Animal {
//	@override
	public void move() {
		System.out.println("가 하늘을 납니다.");
	}
	public String toString() {
		return "독수리";
	}
}

public class AnimalTest1 {
	public void moveAnimal(Animal animal) { // 매개변수의 자료형이 상위 클래스
		System.out.print(animal);
		animal.move();						// 재정이 된 매서드 호출
	}
	public static void main(String[] args) {
//		다형성(Polymorphism) 활용
		AnimalTest1 at = new AnimalTest1();
		at.moveAnimal(new Human()); // Animal animal = new Human();
		at.moveAnimal(new Tiger()); // Animal animal = new Tiger();
		at.moveAnimal(new Eagle()); // Animal animal = new Eagle();
		
//		Eagle e = new Eagle();
//		e.move();
//		e.flying();
//		Tiger t = new Tiger();
//		t.move();
//		t.hunting();
//		Human h = new Human();
//		h.move();
//		h.readBook();
	}

}
