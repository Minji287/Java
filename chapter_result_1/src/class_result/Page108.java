package class_result;

public class Page108 {
	int month;
	void page108Info() {
		switch(month) {
		case 3: case 4: case 5:
			System.out.println("현재는 봄입니다");
			break;
		case 6: case 7: case 8:
			System.out.println("현재는 여름입니다");
			break;
		case 9: case 10: case 115:
			System.out.println("현재는 가을입니다");
			break;
		case 1: case 2: case 12:
			System.out.println("현재는 겨울입니다");
			break;
		default:
			System.out.println("월을 잘 못입력하셨네요("+month + ")");
		}
	}
}
