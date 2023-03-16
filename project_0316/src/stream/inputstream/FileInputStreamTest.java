package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		int i = 0;
		try {
			fis = new FileInputStream("input.txt");
			while((i = fis.read()) != -1) { // -1은 파일의 끝
				System.out.print((char)i);
				System.out.print(i);
			}
		} catch(IOException e) {
			System.out.println(e);
		} catch(NullPointerException e) {
			System.out.println(e);
		} finally {
			try {
				fis.close();
				System.out.println("finally");
			} catch(IOException e) {
				System.out.println(e);
			}
		}
		System.out.println("End");
	}

}
