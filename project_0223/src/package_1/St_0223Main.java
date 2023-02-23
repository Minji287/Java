package package_1;

import java.util.Scanner;

public class St_0223Main {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		St_0223 st = new St_0223();
		System.out.println("이름?");
		st.name = ss.nextLine();
		System.out.println("국어 성적?");
		st.kor = ss.nextInt();
		System.out.println("수학 성적?");
		st.mat = ss.nextInt();
		
		st.st_0223show();
	}

}
