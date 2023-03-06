package package_2;

public class AnimalMain {
	void move(Animal animal) {
		animal.move();
	}
	public static void main(String[] args) {
		AnimalMain animal = new AnimalMain();
		animal.move(new Dog()); // Animal animal = new Dog();
		animal.move(new Cat());
		animal.move(new Elk());
//		Animal animal1 = new Dog();
//		animal1.move();
	}

}
