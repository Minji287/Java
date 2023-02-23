package package_1;

public class Ex7_4 {

	public static void main(String[] args) {
		Point3D2 p = new Point3D2(1, 2, 3);
		System.out.println("x=" + p.x + ", y=" + p.y + ", z=" + p.z);
	}
}
	class Point3 {
		int x, y;
		Point3(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
	class Point3D2 extends Point3{
		int z;
		
		Point3D2(int x, int y, int z){
			super(x, y); // Point(int x, int y)를 호출
			this.z = z;
		}
	}
