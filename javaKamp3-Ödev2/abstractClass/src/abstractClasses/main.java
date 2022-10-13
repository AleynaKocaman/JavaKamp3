package abstractClasses;

public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WomenGameCalculator womenGameCalculator=new WomenGameCalculator();
		womenGameCalculator.hesapla();
		womenGameCalculator.gameOver();
		
		/*
		GameCalculator gameCalculator=new GameCalculator() {
			
			@Override
			public void hesapla() {
				// TODO Auto-generated method stub
				
			}
		};
		*/
		
		GameCalculator gameCalculator=new ManGameCalculator();
		gameCalculator.hesapla();
		gameCalculator.gameOver();

	}

}
