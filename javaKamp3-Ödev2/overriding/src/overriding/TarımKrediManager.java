package overriding;

public class TarımKrediManager extends BaseKrediManager{

	public TarımKrediManager() {
		// TODO Auto-generated constructor stub
	}
	
	public double hesapla(double tutar) {
		return tutar*1.10;
	}

}
