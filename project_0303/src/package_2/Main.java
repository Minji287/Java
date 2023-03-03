package package_2;

abstract class Animal {
	abstract void crying();
}
class Cat extends Animal {
	@Override
	void crying() {
		System.out.println("야옹 야옹!");
	}
}
class Dog extends Animal {
	@Override
	void crying() {
		System.out.println("멍 멍!");
	}
}
class Fox extends Animal {
	@Override
	void crying() {
		System.out.println("딩딩딩딩 딩딩딩 디딩!");
	}
}

public class Main {
	public void cryAnimal(Animal an) {
		an.crying();
	}
	public static void main(String[] args) {
		Main mm = new Main();
		mm.cryAnimal(new Fox());
		
		Animal an = new Fox();
		an.crying();
	}

}
