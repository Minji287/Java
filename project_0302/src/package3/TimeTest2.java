package package3;

class Time2 {
	private int hour;
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if(isValidHour(hour)) return;
		this.hour = hour;
	}
	private boolean isValidHour(int hour) {
		return hour < 0 || hour > 23;
	}
	public int getHour() { return hour; }
}

public class TimeTest2 {
	public static void main(String[] args) {
		Time2 t = new Time2();
		t.setHour(21);
		System.out.println(t.getHour());
		t.setHour(100); // setHour 조건에서 걸러진다.
		System.out.println(t.getHour());
	}

}
