package chapter3;

public class Ex3_14 {

	public static void main(String[] args) {
		String str1 = "abc"; // String str1 = new String("abc");
		String str2 = new String("abc"); // String str2 = "abc";
		
		System.out.println("\"감사합니다\"");
		System.out.printf("\"abc\" == \"abc\" ? %b%n", "abc" == "abc");
		System.out.printf("\"abc\" == \"abs\" ? %b%n", "abc" == "abs");
		System.out.printf("\"abc\" == \"abc\" ? %b%n%n", str1.equals("abc"));
		
		String a = "sst";
		String b = "ppt";
		
		System.out.println("참(true), 거짓(false)으로 답하시오");
		
		System.out.printf("a와 b가 같으냐? %b%n", a.equals(b));
		System.out.printf("a와 b가 같으냐? %b%n", a == b);
		
		System.out.println("a와 b가 같으냐? " +  a.equals(b));
		System.out.println("a와 b가 같으냐? " +  (a == b));
		
		System.out.println("a");
		System.out.println('a');
	}
	
}
