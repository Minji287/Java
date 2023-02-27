package package_2;

class Hakjum{
	String name;
	int kor;
	int eng;
	int mat;
	void show() {
		int total = kor + eng + mat;
		int avg = total / 3;
		int grade = avg / 10;
		char g;
		switch(grade) {
		case 10: case 9: g = 'A'; break;
		case 8: g = 'B'; break;
		case 7: g = 'C'; break;
		case 6: g = 'D'; break;
		default: g = 'F'; break;
		}
		
		System.out.println("이름: " + name);
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + mat);
		System.out.println("합계: " + total);
		System.out.println("평균: " + avg);
		System.out.println("학점: " + g);
	}
}
