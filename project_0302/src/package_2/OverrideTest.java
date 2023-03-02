package package_2;
class Point7 {
	int x;
	int y;
	String getLocation() {
		return "x: " + x + ", y: " + y;
	}
}
class Point3D7 extends Point7 {
	int z;
	String getLocation() { // 조상의 getLocation()을 오버라이딩
		return "x: " + x + ", y: " + y + ", z: " +z;
	}
}
public class OverrideTest {
	public static void main(String[] args) {
		Point3D7 p = new Point3D7();
		p.x = 3;
		p.y = 5;
		p.z = 7;
		System.out.println(p.getLocation());
	}

}
