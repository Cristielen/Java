package entities;

public class Produto {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProduct(int quantity) {
		//ele chama o atributo da classe
		this.quantity += quantity;
	}
	
	public void removeProduct(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name +
				", $" +
	String.format("%.2f", price) +
	", "
	+ quantity + " units, Total: $" +
	String.format("%.2f", totalValueInStock());
	}

}
