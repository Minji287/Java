package package_1;

public class Ex4_2 {

	public static void main(String[] args) {
		int x = 0;
		System.out.printf("x=%d 일 때, 참인 것은%n", x);
//		printf의 f는 form
		
		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)");
		
		x = 1;
		System.out.printf("x=%d 일 때, 참인 것은%n", x);
		System.out.println("x=" + x + " 일 때, 참인 것은");
		
		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)");
		
		String str = "YES";
		
		if(str.equalsIgnoreCase("yes")) {
			System.out.println("예");
		}
		else {
			System.out.println("아니요");
		}
	}

}
