package package_2;

public class FruitMain2 {

	public static void main(String[] args) {
		Calculate c = new Calculate();
		System.out.printf("%14s", "영수증\n");
		System.out.println("------------------------");
		c.purchase(new Banana2(2));
		c.purchase(new Peach2(3));
		c.purchase(new Watermelon2(1));
		c.total();
	}

}
