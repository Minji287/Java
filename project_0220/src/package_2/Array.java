package package_2;

public class Array {
	
	public static void main(String[] args) {
		int[] s1 = { 50, 70, 80, 60, 30 };
		for(int i = 0; i < s1.length; i++) {
//			System.out.print(s1[i] + " ");
//			System.out.println("점수 = " + s1[i] + ", 학점 = " + change(s1[i]));
			System.out.println("점수 = " + s1[i] + ", 학점 = " + changeSwitch(s1[i]));
		}
	}
	
	public static char change(int score) {
		if(score > 89) { return 'A'; }
		else if(score > 79) { return 'B'; }
		else if(score > 69) { return 'C'; }
		else if(score > 59) { return 'D'; }
		else { return 'F'; }
	}
	
	public static char changeSwitch(int score) {
		int ss = score / 10;
		switch(ss) {
		case 10: case 9: return 'A';
		case 8: return 'B';
		case 7: return 'C';
		case 6: return 'D';
		default: return 'F';
		}
	}

}
