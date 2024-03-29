package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("input3.txt")){
			byte[] bs = new byte[10];
			int i;
			while((i = fis.read(bs)) != -1) {
				for(byte b : bs) {
					System.out.print((char)b);
				}
			} 
			System.out.println();
		} catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("End");
	}

}
