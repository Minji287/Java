package package_1;

public class P53 {

	public static void main(String[] args) {
		/*
		 * P53
		 * 1) "인천능력교육개발원" 을 문자열 변수에 저장
		 * 2) 2.75 를 실수형 변수에 저장
		 * 3) 89 를 정수형 변수에 저장
		 * 4) 문자 A를 문자형 변수에 저장
		 * 5) 2.75가 저장된 변수와 89가 저장된 변수를 더해서 2.75+89 = 91.75가 되도록 출력
		 * 6) 2.75가 저장된 변수와 89가 저장된 변수를 더해서 2.75+89 = 91 이 되도록 출력
		 * 8) 문자 A가 저장된 변수를 정수형 변수에 저장하고 그 정수형 변수를 
		 * "문자 A의 유니코드 값은? 65"와 같이 인쇄 되도록 출력
		 * 9) "인천능력교육개발원"이 저장되어 있는 변수를 출력하시오. 
		 */
		String str = "인천능력교육개발원";
		double x = 2.75;
		int y = 89;
		char c = 'A';
		int a = c;
		
		System.out.println(x + "+" + y + " = " + (x + y));
		System.out.println(x + "+" + y + " = " + (int)(x + y));
		System.out.println("문자 A의 유니코드 값은? " + a);
		System.out.println(str);
	}

}
