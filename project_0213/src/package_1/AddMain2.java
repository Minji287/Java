package package_1;

public class AddMain2 {

	public static void main(String[] args) {
		AddMain2 ss = new AddMain2();
		ss.a = 78;
		ss.b = 88;
		ss.addInfo();
	}
	int a;
	int b;
	int sum;
	void addInfo() {
		sum = a + b;
		System.out.println(sum);
	}

}
