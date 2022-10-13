package interfaces;

public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		ICustomerDal customerDal=new OracleCustomerDal();
		customerDal.add();
		*/
		
		CustomerManager customerManager=new CustomerManager(new MySglCustomerDal());
		customerManager.add();
		
	}

}
