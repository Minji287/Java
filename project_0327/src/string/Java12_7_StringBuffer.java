package string;

public class Java12_7_StringBuffer {

	public static void main(String[] args) {
		//파일명을 바꾸는 예제 
		StringBuffer strFileName = new StringBuffer(100);
		strFileName.append("test.txt");
		System.out.println(strFileName);//test.txt
		
		strFileName.delete(0,  strFileName.length()-4);// test delete
		System.out.println(strFileName);
		strFileName.insert(0, "success");
		System.out.println(strFileName);
	}

}
