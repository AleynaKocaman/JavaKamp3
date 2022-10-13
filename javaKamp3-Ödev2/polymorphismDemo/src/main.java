
public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		DataBaseLogger log=new DataBaseLogger();
		log.Log("database");
		
		FileLogger log2=new FileLogger();
		log2.Log("file ");
		
		EmailLogger log3=new EmailLogger();
		log3.Log("email ");
		*/
		
		/*
		BaseLogger[] dizi= {new DataBaseLogger(),new FileLogger(),new EmailLogger(),new() ConsoleLogger};		
		for (BaseLogger baseLogger : dizi) {
			
			baseLogger.Log("Loglandý");
			
		}
		*/

		CustomerManager customerManager=new CustomerManager(new DataBaseLogger());
		customerManager.add();
		
		
	}

}
