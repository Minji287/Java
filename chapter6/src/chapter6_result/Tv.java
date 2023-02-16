package chapter6_result;

public class Tv {
	String color;
	boolean power;
	int channel;
	
	void powerOn() {
		power = true;
		System.out.println("전원: " + power + "(On)");
	}
	void powerOff() {
		power = false;
		System.out.println("전원: " + power + "(Off)");
	}
	void channelUp() {
		++channel;
		System.out.println("현재 채널은: " + channel);
	}
	void channelDown() {
		--channel;
		System.out.println("현재 채널은: " + channel);
	}
	void colorYellow() {
		color = "yellow";
		System.out.println("현재 색상은: " + color);
	}
}
