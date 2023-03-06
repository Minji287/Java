package package_3;

public class ComputerMain {

	public static void main(String[] args) {
		Computer c2 = new Desktop();
		c2.display();
		c2.typing();
		
		Computer c3 = new NoteBook();
		c3.display();
		c3.typing();
		
		NoteBook notebook = (NoteBook)c3;
		notebook.display();
	}

}
