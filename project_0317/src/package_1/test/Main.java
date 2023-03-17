package package_1.test;

public class Main{            

	public static void main(String[] args) {
		Student st = new Student("이순신", "인천 부평구", 20230501);
		st.jobName = "프로그래머";
		
		System.out.println(Job.GRADE + "학년");
		st.job();
	}
	

}
