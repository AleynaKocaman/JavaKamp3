package interfaces;

public class CustomerManager {

	
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		// TODO Auto-generated constructor stub
		this.customerDal=customerDal;
	}
	
	public void add() {
		customerDal.add();
	}

	 
	
}
