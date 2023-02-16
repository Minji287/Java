package chapter6_result;

public class TvMain {

	public static void main(String[] args) {
		Tv ts = new Tv();
		ts.channel = 33;
		ts.powerOn();
		ts.powerOff();
		ts.channelUp();
		ts.channelDown();
		ts.colorYellow();
	}

}
