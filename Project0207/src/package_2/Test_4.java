package package_2;

public class Test_4 {

	public static void main(String[] args) {
//		별 찍기
		for(int i = 1; i <= 10; i++) { // 행의 수(외부반복 -> 10줄 생성)
			for(int j = 1; j <= i ; j++) { // 열의 수(내부 반복 -> *를 0에서 i까지 수만큼 출력)
				System.out.print("*");
			}
			System.out.println(); // 내부 반족 후 한줄 띄어줌
		}
	}

}
