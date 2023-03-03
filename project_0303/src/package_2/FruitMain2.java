package package_2;

import java.util.Scanner;

abstract class Fruit2 {
	int p, q;
	abstract void list(int q);
}
class Watermelon2 extends Fruit2{
	int p = 10000;
	@Override
	void list(int q) {
		this.q = q;
	}
	public String toString() { return "수박"; }
}
class Peach2 extends Fruit2{
	int p = 2000;
	@Override
	void list(int q) {
		
	}
	public String toString() { return "복숭아"; }
}
class Banana2 extends Fruit2{
	int p = 5000;
	@Override
	void list(int q) {
		
	}
	public String toString() { return "바나나"; }
}

public class FruitMain2 {
	int total = 0;
	void purchase(Fruit2 f) {
		System.out.println(f + " " + f.p + "원 * "
					+ f.q + " = " + f.p*f.q + "원");
		total += f.p*f.q;
	}
	void total() {
		System.out.println("------------------------");
		System.out.printf("%22d", total);
		System.out.println("원");
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		System.out.printf("%14s", "영수증\n");
		System.out.println("------------------------");
		
		
		
	}

}
