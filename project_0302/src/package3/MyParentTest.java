package package3;
class MyParent {
	private int prv; // 같은 클래스
	public int getPrv() {
		return prv;
	}
	public void setPrv(int prv) {
		this.prv = prv;
	}
	
	int dft; // 같은 패키지
	protected int prt; // 같은 패키지 + 자손(다른 패키지)
	public int pub; // 접근 제한 없음
	public void printMembers() {
		System.out.println(prv); // OK
		System.out.println(dft); // OK
		System.out.println(prt); // OK
		System.out.println(pub); // OK
	}
}
public class MyParentTest {
	public static void main(String[] args) {
		MyParent p = new MyParent();
		System.out.println(p.getPrv()); // prv(private)이기 떄문에
										// getters & setters 사용해야함
		System.out.println(p.dft); // OK
		System.out.println(p.prt); // OK
		System.out.println(p.pub); // OK
	}

}
