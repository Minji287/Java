package package_1.generics;

public class ThreeDPrinter<T extends Material> {
//	<T extends Material>은 Material을 상속 받은 class만 사용 가능하게 하는 것(조건)
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return material.toString();
	}

	
}
