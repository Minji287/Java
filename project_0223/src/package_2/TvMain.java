package package_2;

public class TvMain {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		SmartTv st = new SmartTv();
		Tv t7 = new SmartTv(); // 다형성 = 업캐스팅
	}

}

// 1. 상속(extends) <-> 포함(객체생성해서 쓰는 것)
// 2. 오버라이딩: 상속받은 메소드 내용을 변경해서 사용 <-> 오버로딩
// 3. super.x , super() => 부모 클래스(슈퍼클래스)
//		this.x , this() => 자식 클래스(서브클래스)