package package_3;

public class TvMain {

	public static void main(String[] args) {
		Tv tt = new Tv();
		tt.channel = 17;
		tt.color = "yellow";
		tt.channelUp();
		tt.channelDown();
		tt.colorChange();
	}

}
