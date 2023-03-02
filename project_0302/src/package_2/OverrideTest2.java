package package_2;
class Point3D {
	int x;
	int y;
	public String toString() { // toString override
		return "x: " + x + ", y: " + y;
	}
}
public class OverrideTest2 {

	public static void main(String[] args) {
		Point3D p = new Point3D();
		p.x = 3;
		p.y = 5;
		System.out.println(p.toString());
		System.out.println("p.x: " + p.x);
		System.out.println("p.y: " + p.y);

	}

}
