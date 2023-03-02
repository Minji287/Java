package package_2;

public class Ex7_4 {
	public static void main(String[] args) {
		Point3D77 p = new Point3D77(1, 2, 3);
		
		System.out.println("x: " + p.x + ", y: " + p.y + ", z: " + p.z);
	}

}
class Point77 {
	int x, y;
	Point77(int x, int y){
		this.x = x;
		this.y = y;
	}
}
class Point3D77 extends Point77 {
	int z;
	Point3D77(int x, int y, int z){
		super(x, y); // 1, 2
		super.x = 7;
		super.y = 9;
		this.z = z;
	}
}
