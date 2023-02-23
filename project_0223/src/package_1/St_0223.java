package package_1;

public class St_0223 {
	
	String name;
	int kor;
	int mat;
	int total;
	int avg;
	public void st_0223show() {
		total = kor + mat;
		avg = total/2;
		System.out.println("이름은 : " + name);
		System.out.println("국어 성적 : " + kor);
		System.out.println("수학 성적 : " + mat);
		System.out.println("합계는 : " + total);
		System.out.println("평균은 : " + avg);
	}
}
