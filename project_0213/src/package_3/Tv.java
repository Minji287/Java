package package_3;

public class Tv {
	String color;
	int channel;
	boolean power;
	void channelUp() {
		++channel;
		System.out.println(channel);
	}
	void channelDown() {
		--channel;
		System.out.println(channel);
	}
	void colorChange() {
		System.out.println("색상: " + color);
	}
}
