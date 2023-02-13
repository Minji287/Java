package package_1;

public class TvMain {

	public static void main(String[] args) {
		Tv tt = new Tv();
		tt.channel = 7;
		tt.channelDown();
		System.out.println("현재 채널 : " + tt.channel + " 입니다.");
	}

}
