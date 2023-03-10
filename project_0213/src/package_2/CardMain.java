package package_2;

public class CardMain {

	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card(); // 객체 생성(인스턴스화 -> () )
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number
				+ "이며, 크기는 (" + Card.width + ", " + Card.height + ")");
		System.out.println("c2은 " + c2.kind + ", " + c2.number
				+ "이며, 크기는 (" + Card.width + ", " + Card.height + ")");
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		Card.width = 50;
		Card.height = 80;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number
				+ "이며, 크기는 (" + Card.width + ", " + Card.height + ")");
		System.out.println("c2은 " + c2.kind + ", " + c2.number
				+ "이며, 크기는 (" + Card.width + ", " + Card.height + ")");
	}

}
