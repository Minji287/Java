package package_2;

class Point{
	int x;
	int y;
	String getLocation() {
		return "x : " + x + ", y = " + y;
	}
}
class Point3D extends Point{
	int z;
	
	String getLocation() { // 오버라이딩
		return "x : " + x + ", y = " + y + ", z = " + z;
	}
}

public class Overriding {

	public static void main(String[] args) {
		Point3D po = new Point3D();
		
		System.out.println(po.getLocation());
	}

}
