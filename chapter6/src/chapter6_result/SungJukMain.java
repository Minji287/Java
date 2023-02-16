package chapter6_result;

import java.util.Scanner;

public class SungJukMain {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		SungJuk sj = new SungJuk();
		
		System.out.println("이름을 입력해주세요.");
		sj.name = in.nextLine();
		System.out.println("국어 성적을 입력해주세요.");
		sj.kor = in.nextInt();
		System.out.println("수학 성적을 입력해주세요.");
		sj.mat = in.nextInt();
		System.out.println("영어 성적을 입력해주세요.");
		sj.eng = in.nextInt();
//		nextInt()가 숫자는 입력받고 개행 문자는 입력 받지 않음
//		Enter(개행문자)는 제거하지않은 채 그대로 남겨둔다.
		System.out.println("주소를 입력해주세요.");
		sj.address = in.next();
//		in.nextLine()을 
//		그래서 nextInt()에 영어성적을 넣고 enter키를 치게되면, \n or ln(개행문자)는 버퍼에 남게 되고 
//		nextLine()에서는 쓰게되면 \n or ln(개행문자)가 남아있어서 그 enter키를 가져가서 사용하기때문에
//		입력 버퍼에 남은 개행문자를 먼저 받아들여 그대로 넘어가는 것
//		next()는 사이띄기, tab키, enter키로 분리해서 데이터를 가져가기 때문에 가능
		
		sj.SungJukInfo();
	}

}
