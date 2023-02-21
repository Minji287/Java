package package_2;

public class Circle77 {
	int radius;
	
	public Circle77(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		Circle77[] c = new Circle77[5];
		
		for(int i = 0; i < c.length; i++) {
			c[i] = new Circle77(i);
		}
		for(int i = 0; i < c.length; i++) {
			System.out.print((int)(c[i].getArea()) + " ");
		}
		
	}

}
