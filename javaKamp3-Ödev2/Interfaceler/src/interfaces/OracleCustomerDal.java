package interfaces;

public class OracleCustomerDal implements ICustomerDal {

	ICustomerDal customerDal;
	
	public OracleCustomerDal(ICustomerDal �CustomerDal) {
		// TODO Auto-generated constructor stub
		this.customerDal=customerDal; 
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("oracle eklendi");
	}

}
