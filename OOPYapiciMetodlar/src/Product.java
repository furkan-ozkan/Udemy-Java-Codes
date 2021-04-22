
public class Product {
	private int productId,amount,price;
	
	public Product(int productId,int amount, int price) {
		this.productId = productId;
		this.amount = amount;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public int getAmount() {
		return amount;
	}

	public int getPrice() {
		return price;
	}
	
}
