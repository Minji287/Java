package package_2.Lambda;

@FunctionalInterface
interface Myfunction2 {
  int calc(int x);
}
public class LambdaEx2 {
  
  public LambdaEx2() {
//	  Myfunction2 f = new Myfunction2() {
//
//		@Override
//		public int calc(int x) {
//			return x;
//		}
//		  
//	  };
	  
      Myfunction2 fsquare = (x) -> {return x*x;};
      System.out.println("fsquare의 결과: "+fsquare.calc(5));
  }
  public static void main(String[] args) {
      new LambdaEx2();
  }
}