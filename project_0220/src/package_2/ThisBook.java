package package_2;

public class ThisBook {
	String title;
	String author;
	int age;
	
	void show() { System.out.println(title + " " + author + " " + age); }
	
	public ThisBook() {
		this("", "");
		System.out.println("생성자 호출됨");
	}
	public ThisBook(String title) {
		this(title, "작자미상");
	}
	public ThisBook(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public ThisBook(String title, String author, int age) {
		this.title = title;
		this.author = author;
		this.age = age;
	}

	public static void main(String[] args) {
//		ThisBook littlePrince = new ThisBook("어린왕자", "생텍쥐페리");
//		ThisBook loveStory = new ThisBook("춘향전");
//		ThisBook emptyBook = new ThisBook();
		ThisBook addAge = new ThisBook("어린왕자", "홍길동", 45);
		addAge.show();
	}

}
