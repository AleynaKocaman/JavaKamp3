
public class CustomerManager {

	private BaseLogger _logger;
	
	public CustomerManager(BaseLogger logger) {
		// TODO Auto-generated constructor stub
		this._logger=logger;
	}
	
	public void add() {
		
		System.out.println("m��teri eklendi");
		this._logger.log("log mesaj�");
		
	}


}
