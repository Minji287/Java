package chapter3;

public class Ex3_2 {

	public static void main(String[] args) {
		int i = 5, j = 0; // 1. 변수 값 저장
				 
		j = i++; // 2. j = i (j에 i를 먼저 넣어주고)
				 //		-> i = 5, j = 5
				 // 3. i++ (i 1 증가)
				 // 	-> i = 6, j = 5
		
		System.out.println("j=i++; 실행 후, i=" + i + ", j=" + j);
				 // 4. 실행 -> i=6, j=5

		
		i = 5;
		j = 0;	 // 1. 변수 값 저장
				 
		j = ++i; // 2. ++i (i 1 증가)
				 // 	-> i = 6, j = 0
				 // 3. j = i (j에 i를 넣어주기)
				 //	 	-> i = 6, j = 6
		System.out.println("j=++i; 실행 후, i=" + i + ", j=" + j);
				 // 4. 실행 -> i=6, j=6
	}

}
