package package_2;

public class Gugudan {

	public static void main(String[] args) {
		int dan;
		int times;
		for(dan = 2; dan <= 2; dan++) { // 행의 수(외부반복 -> 줄 생성)
			for(times = 1; times <= 9; times++) { // 열의 수(내부 반복 ->
													//	for문 안에 조건을 1에서 times까지 수만큼 출력)
				System.out.println(dan + " X " + times + " = " + dan*times);
			}
			System.out.println(); // 내부 반족 후 한줄 띄어줌
		}
	}

}
