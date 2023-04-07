package package_1;

public class SungJuk {
	String name;
	int kor;
	int eng;
	int mat;

	public SungJuk() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void Result() {
		int sum = kor + eng + mat;
		int avg = sum / 3;
		char grade = 'A';
		
		switch(avg / 10){
		case 9: case 10: grade = 'A'; break;
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		case 5: grade = 'F'; break;
		}
		
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + grade);
	}
}
