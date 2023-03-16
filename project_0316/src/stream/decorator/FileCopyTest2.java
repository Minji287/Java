package stream.decorator;

import java.io.*;

public class FileCopyTest2 {

	public static void main(String[] args) {
		long milliseconds = 0;
		int len = 0;
		try(FileInputStream fis = new FileInputStream("input.txt");
			FileOutputStream fos = new FileOutputStream("Poutput.txt")){
			// 파일을 복사하려고 한다.
			milliseconds = System.currentTimeMillis();
			int i;
			while((i = fis.read()) != -1) { // 복사
				fos.write(i);
				len++;
			}
			milliseconds = System.currentTimeMillis() - milliseconds;
 		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println(len);
		System.out.println(milliseconds);
				
	}

}
