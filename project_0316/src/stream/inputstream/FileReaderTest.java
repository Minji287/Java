package stream.inputstream;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		FileReader fr = null;
		int i = 0;
		String frData = "frDate.txt";
		try {
			fr = new FileReader(frData);
			while((i = fr.read()) != -1) {
				System.out.println((char)i);
			}
		} catch(IOException e) {
			System.out.println(e);
		} finally {
			try {
				fr.close();
			} catch(IOException e) {
				System.out.println(e);
			} catch(NullPointerException e) {
				System.out.println(e);
			}
		}
		System.out.println("End");
	}

}
