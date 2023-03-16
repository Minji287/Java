package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) {
		byte[] bs = new byte[26];
		byte data = 65;
		for(int i = 0; i < bs.length; i++) { // 버퍼에 저장
			bs[i] = data++;
		}
		try(FileOutputStream fos = new FileOutputStream("output2.txt", false)) {
//														true면 기존자료 삭제 없이 삽입
//														false면 기존자료 삭제 후 삽입
			fos.write(bs, 2, 10);
		} catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("End");
	}

}
