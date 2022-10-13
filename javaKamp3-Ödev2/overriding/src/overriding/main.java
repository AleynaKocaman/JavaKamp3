package overriding;

public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
		System.out.println(ogretmenKrediManager.hesapla(100));
		
		BaseKrediManager[] krediManagers=new BaseKrediManager[] {
				new OgretmenKrediManager(),new TarımKrediManager()
		};
		
		for (BaseKrediManager baseKrediManager : krediManagers) {
			System.out.println(baseKrediManager.hesapla(100));
			
		}
		
		
	
	
	
	
	
	
	
	}

}
