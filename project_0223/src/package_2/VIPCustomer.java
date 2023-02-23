package package_2;

public class VIPCustomer extends Customer {
	private double saleRate; // VIP를 위한 할인율
	private int agentID;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRate = 0.1;
	}
	public int getAgentID() { // 자료를 제공만하려 하므로 setAgentID는 만들지 않는다.
		return agentID;
	}
}
