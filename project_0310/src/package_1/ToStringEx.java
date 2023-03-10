package package_1;

class Book {
	String title;
	String author;
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}

//	@Override
//	public String toString() {
//		return "책 이름은 " + title + "이고, 저자는 " + author + "입니다.";
//	}
}

public class ToStringEx {

	public static void main(String[] args) {
		Book book = new Book("자바", "강수님");
		System.out.println(book);
		System.out.println("책 이름은 " + book.title + "이고, 저자는 " + book.author + "입니다.");
		String str = new String("test");
		System.out.println(str);
	}

}
