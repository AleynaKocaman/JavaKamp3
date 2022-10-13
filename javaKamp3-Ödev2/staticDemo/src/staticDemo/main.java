package staticDemo;

public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductManager manager=new ProductManager();
		Product product=new Product();
		product.price=10;
		product.name="mouse";
		
		manager.add(product);
		

	}

}
