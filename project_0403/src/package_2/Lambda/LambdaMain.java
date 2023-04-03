package package_2.Lambda;

@FunctionalInterface
interface InterfaceMy {
	int add(int x, int y);
}

public class LambdaMain {
	
//	public LambdaMain() {
//		InterfaceMy my = new InterfaceMy() {
//
//			@Override
//			public int add(int x, int y) {
//				return x+y;
//			}
//			
//		};
//		InterfaceMy interfaceMy = (x, y) -> {return x+y;};
//		System.out.println("interfaceMy 의 결과: " + interfaceMy.add(77, 99));
//	}
	
	public static void main(String[] args) {
		InterfaceMy interfaceMy = (x, y) -> {return x+y;};
		System.out.println("interfaceMy 의 결과: " + interfaceMy.add(77, 99));
	}

}
