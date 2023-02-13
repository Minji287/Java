package package_3;

public class Score {
	String name;
	int kor;
	int mat;
	int eng;
	int total;
	int avg;
	void info(){
		total = kor + mat + eng;
		avg = total / 3;
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("수학 : " + mat);
		System.out.println("영어 : " + eng);
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + avg);
	}
}
