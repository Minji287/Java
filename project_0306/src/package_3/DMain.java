package package_3;

interface Dog {
	abstract void crying();
	final int hh = 45;
	public void show();
}
interface Cat {
	abstract void crying();
	public void two();
}

public class DMain implements Dog, Cat {

	public static void main(String[] args) {
		DMain dmain = new DMain();
		dmain.crying();
	}

	@Override
	public void crying() {
		System.out.println("울다");
	}

	@Override
	public void show() {
		System.out.println("보인다");
	}

	@Override
	public void two() {
		// TODO Auto-generated method stub
		
	}

}
