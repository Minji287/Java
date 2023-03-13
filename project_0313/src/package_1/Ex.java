package package_1;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		Calculate c = new Calculate();
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		Calculate c = new Calculate(n1, n2);
		c.show();
	}

}

class Calculate {
	int n1;
	int n2;
	Calculate() {}
	Calculate(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	int add(int n1, int n2) {
		return n1 + n2;
	}
	int multiply(int n1, int n2) {
		return n1 * n2;
	}
	void show() {
		System.out.println(add(n1,n2));
		System.out.println(multiply(n1,n2));
	}
}
