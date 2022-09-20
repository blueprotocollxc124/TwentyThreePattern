package staticProxy;

/*
 *@Author  LXC BlueProtocol
 *@Since   2022/9/20
 */


public class HouseProxy implements Rent {
	  
	  private Host host = new Host();
	  
	  @Override
	  public void rentHouse() {
			seeHouse();
			writeProtocol();
			host.rentHouse();
			receiveProxyMoney();
	  }
	  
	  
	  private void seeHouse() {
			System.out.println("中介帶你去看房");
	  }
	  
	  private void writeProtocol() {
			System.out.println("签订租聘合同");
	  }
	  
	  private void receiveProxyMoney() {
			System.out.println("收取代理费用");
	  }
	  
	  
}
