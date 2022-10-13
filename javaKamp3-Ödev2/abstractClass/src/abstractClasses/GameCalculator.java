package abstractClasses;

public abstract class GameCalculator {

	public GameCalculator() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract void hesapla();
	
	public final void gameOver() { //final kelimesi ile hiçbir zaman deðiþtilemez
		System.out.println("Oyun Bitti");
	}

}
