package abstractDemo;

public class CustomerManager {
	
	BaseDatabaseManager databaseManager;



	public CustomerManager() {
		// TODO Auto-generated constructor stub
	}



	public void getCustomers() {
		
		databaseManager.getData();
	}

}
