package package_1;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer(); // 업캐스팅
		customer.buy();
		customer.sell();
		Buy buy = customer; // 업캐스팅
		buy.buy();
		Sell sell = customer;
		sell.sell();
		
		buy.order();
		sell.order();
	}

}
