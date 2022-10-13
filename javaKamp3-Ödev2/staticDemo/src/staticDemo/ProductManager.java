package staticDemo;

public class ProductManager {

	public ProductManager() {
		// TODO Auto-generated constructor stub
	}
	
	public void add(Product product) {
		
		ProductValidator validator=new ProductValidator(); 
		if(validator.isValid(product)) {
			System.out.println("eklendi");
		}else {
			
			System.out.println("Ürün bilgileri geçersizdir");
		}
	
	}

}
