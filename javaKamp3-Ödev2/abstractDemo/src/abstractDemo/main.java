package abstractDemo;

public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomerManager customerManager=new CustomerManager();
		customerManager.databaseManager=new OracleDatabaseManager();
		customerManager.getCustomers();
		

	}

}
