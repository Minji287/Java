package package_2;

public abstract class Animal {
	abstract void move();
}
class Dog extends Animal {

	@Override
	void move() {
		System.out.println("잘 달린다.");
	}
}
class Cat extends Animal {

	@Override
	void move() {
		System.out.println("엉금 엉금 긴다.");
	}
}
class Elk extends Animal {

	@Override
	void move() {
		System.out.println("멀리 잘뛴다.");
	}
}

