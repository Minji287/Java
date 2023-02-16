package class_result;

import java.util.Scanner;

public class Pabg103Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Page103 ss = new Page103();
		System.out.println("성적을 입력하세요?");
		ss.score = scn.nextInt();
		ss.Page103Info();

	}

}
