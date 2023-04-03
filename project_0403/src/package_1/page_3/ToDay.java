package package_1.page_3;

class Lunch{
	public String lunch() {
		String s1 = "점심 맛있게 먹었나요?";
		return s1;
	}
}

public class ToDay {

	public static void main(String[] args) {
		Lunch pp = new Lunch() {
			public String lunch() {
				String ff = "순대국 먹었어요";
				return ff;
			}
		};
		System.out.println(pp.lunch());
		
		Lunch p2 = new Lunch();
		System.out.println(p2.lunch());
	}

}
