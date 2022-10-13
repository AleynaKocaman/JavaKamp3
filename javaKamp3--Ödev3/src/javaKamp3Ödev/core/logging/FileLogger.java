package javaKamp3Ödev.core.logging;

public class FileLogger implements Logger {

	public FileLogger() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void log(String data) {
		// TODO Auto-generated method stub
		System.out.println("Dosya ile loglandý: "+data);
		
	}

}
