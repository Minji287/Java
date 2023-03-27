package string;

public class Java12_6_StringBuffer {

	public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer("abcdefg");//생성자 사용
		String str2 = "hijk"; // new String("hijk") 생략 = 오토박싱
		str1.append(str2);
		System.out.println(str1 + " 문자열 길이 : " + 
					str1.length());
		
		StringBuffer str3 = new StringBuffer(100);//여유있게 잡는다
		str3.append("abcdefghijklm");
		System.out.println(str3 + " 문자 길이 : "
						+ str3.length());
	}

}
