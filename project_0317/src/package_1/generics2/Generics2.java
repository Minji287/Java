package package_1.generics2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Product {
	
	@Override
	public String toString() {
		return "Product";
	}
	
}
class Tv extends Product {

	@Override
	public String toString() {
		return "Tv";
	}
	
}
class Audio extends Product {
	
	@Override
	public String toString() {
		return "Audio";
	}
	
}
public class Generics2 {

	public static void main(String[] args) {
//		ArrayList<Tv> list = new ArrayList<Tv>();
//		
//		List<Tv> list3 = new ArrayList<Tv>();
//		System.out.println(list3);
//		List<Tv> list4 = new LinkedList<Tv>();
		
		ArrayList<Product> list5 = new ArrayList<Product>(); // 다형성
		// 다형성 조상(Super)를 사용한 것
		list5.add(new Product());
		list5.add(new Tv());
		list5.add(new Audio());
		System.out.println(list5);
	}

}
