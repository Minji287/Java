package package_2;

import java.util.Scanner;

public class CustomerTest1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Customer customerLee = new Customer();
		System.out.println("아이디?");
		int id = in.nextInt();
		customerLee.setCustomerID(id);
		System.out.println("이름?");
		String name = in.next();
		customerLee.setCustomerName(name);
		
		VIPCustomer customerKim = new VIPCustomer();
		System.out.println("아이디?");
		int id2 = in.nextInt();
		customerKim.setCustomerID(id2);
		System.out.println("이름?");
		String name2 = in.next();
		customerKim.setCustomerName(name2);
		
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());
	}

}
