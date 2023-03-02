package package3;

class Time {
	private int hour;
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) return;
		this.hour = hour;
	}
	public int getHour() { return hour; }
}

public class TimeTest {
	public static void main(String[] args) {
		Time t = new Time();
//		t.hour = -100; 오류
		t.setHour(21);
		System.out.println(t.getHour());
		t.setHour(100); // setHour 조건에서 걸러진다.
		System.out.println(t.getHour());
	}

}
