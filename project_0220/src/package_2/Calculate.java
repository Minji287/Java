package package_2;

public class Calculate {
	int a, b;
	public int add() { return a+b; }
	public int sub() { return a-b; }
	public int mul() { return a*b; }
	
	public void result() { 
		System.out.println(a + " + " + b + " = " + (a+b));
		System.out.println(a + " - " + b + " = " + (a-b));
		System.out.println(a + " * " + b + " = " + (a*b));
	}
	
	public static void main(String[] args) {
		Calculate cal = new Calculate();
		cal.a = 50;
		cal.b = 70;
		cal.add();
		cal.sub();
		cal.mul();
		cal.result();
	}

}
