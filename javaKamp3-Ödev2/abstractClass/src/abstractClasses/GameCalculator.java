package abstractClasses;

public abstract class GameCalculator {

	public GameCalculator() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract void hesapla();
	
	public final void gameOver() { //final kelimesi ile hi�bir zaman de�i�tilemez
		System.out.println("Oyun Bitti");
	}

}
