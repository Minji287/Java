package package_2;

public class Card {
	// 매개 변수(멤버 변수)
	String kind; // instance 변수
	int number; // class 에서 선언, 객체생성해서 사용 가능
	static int width = 100; // class 변수 ex) Card.width
	static int height = 250; // class 에서 선언, static이 붙으면 메인에 가져가서 쓸 수 있음(객체 생성 안해도 됨)
}
