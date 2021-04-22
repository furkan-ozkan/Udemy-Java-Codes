import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product> urunler = new ArrayList<Product>();
		urunler.add(new Product(100));
		urunler.add(new Product(101));
		urunler.add(new Product(102));
		urunler.add(new Product(110));
		for(Product product:urunler) {
			System.out.println(product.price);
		}
	}

}
