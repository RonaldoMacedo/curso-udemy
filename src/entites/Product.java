package entites;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int n) {
		this.quantity += n;
	}
	
	public void removeProducts(int n) {
		this.quantity -= n;
	}

}
