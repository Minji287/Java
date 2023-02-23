package package_1;
//p.224
	class Tv{
		boolean power;
		int channel;
		
		void power() 		{	power =!power;	}
		void channe1Up() 	{	++channel;	}
		void channe1Down()	{	--channel;	}
	}
	class SmartTv extends Tv {
		boolean caption;
		void displayCaption(String text) {
			if (caption) {
				System.out.println(text);
			}
		}
	}
	class Ex7_1{
	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel = 10;
		stv.channe1Up();
		System.out.println(stv.channel);
		stv.displayCaption("Hello,World");
		stv.caption=true;
		stv.displayCaption("Hello,World");

	}
	}