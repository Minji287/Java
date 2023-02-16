package chapter6_result;

public class SungJuk {
	String name;
	int kor;
	int mat;
	int eng;
	int total;
	int avg;
	String address;
	
	void SungJukInfo() {
		total = kor + mat + eng;
		avg = total / 3;
		System.out.println("이름: " + name);
		System.out.println("국어: " + kor);
		System.out.println("수학: " + mat);
		System.out.println("영어: " + eng);
		System.out.println("합계: " + total);
		System.out.println("평균: " + avg);
		System.out.println("주소: " + address);
	}
}
