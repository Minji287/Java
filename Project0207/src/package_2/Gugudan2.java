package package_2;

public class Gugudan2 {

	public static void main(String[] args) {
		int dan = 2;
		int times = 1;
		
		while(dan <= 2) {
			while(times <= 9) {
				System.out.println(dan + " X " + times + " = " + dan*times);
				times++;
			}
			dan++;
			System.out.println();
		}
		
//		int dan = 1;
//		int times = 1;
//
//		while(dan <= 2) {
//			dan++;
//			while(times <= 9) {
//				System.out.println(dan + " X " + times + " = " + dan*times);
//				times++;
//			}
//			System.out.println();
//		}
		
	}

}
