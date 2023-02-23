package package_1;
class Point {
	int x;
	int y;
	
	String getLocation() {
		return "x: " + x + ", y: " + y;
	}
}

class Point3D extends Point{
	int z;
	
	String getLocation() {
		return "x: " + x + ", y: " + y + ", z: " + z;
	}
}
public class Page_229 {
	
	public static void main(String[] args) {
		Point3D d3 = new Point3D();
		d3.x = 7;
		d3.y = 92;
		d3.z = 5;
		System.out.println(d3.getLocation());

	}

}
