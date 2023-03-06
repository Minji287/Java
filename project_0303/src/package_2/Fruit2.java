package package_2;

abstract class Fruit2 {
	int p, q;
	Fruit2(int p, int q) {
		this.p = p;
		this.q = q;
	}
}
class Watermelon2 extends Fruit2{
	Watermelon2(int q) {
		super(10000, q);
		
	}
	public String toString() { return "수박"; }
}
class Peach2 extends Fruit2{

	Peach2(int q) {
		super(2000, q);
	}

	public String toString() { return "복숭아"; }
}
class Banana2 extends Fruit2{

	Banana2(int q) {
		super(5000, q);
	}

	public String toString() { return "바나나"; }
}

class Calculate {
	int totalEach = 0;
	int total = 0;
	void purchase(Fruit2 f) {
		totalEach = f.p*f.q;
		total += totalEach;
		System.out.println(f + " " + f.p + "원 * "
					+ f.q + " = " + totalEach + "원");
	}
	void total() {
		System.out.println("------------------------");
		System.out.printf("합계%19d", total);
		System.out.println("원");
	}

}

