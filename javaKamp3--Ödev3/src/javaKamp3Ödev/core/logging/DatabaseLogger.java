package javaKamp3�dev.core.logging;

public class DatabaseLogger implements Logger{

	public DatabaseLogger() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void log(String data) {
		// TODO Auto-generated method stub
		System.out.println("Database ile logland�: "+data);
		
	}

}
