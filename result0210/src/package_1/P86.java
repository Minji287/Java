package package_1;

public class P86 {

	public static void main(String[] args) {
		/*
		 * P86
		 * 1) str 변수에 "ksk" 를 저장(String str = "ksk")하고 str 변수에 있는 문자가 "ksk" 와 같은가 비교하여
		 * 같으면 true, 아니면 false를 출력하고,
		 * 2) String str2 = new String("pps"); 와 같이 저장하고 str2 변수에 있는 문자가 "pps" 와 같은가 비교하여
		 * 같으면 true, 아니면 false를 출력하는 프로그램을 작성하시오.
		 */
		String str = "ksk";
		String str2 = new String("pps");
		System.out.println("str = ksk? " + str.equals("ksk"));
		System.out.println("str2 = pps? " + str2.equals("pps"));
	}

}
