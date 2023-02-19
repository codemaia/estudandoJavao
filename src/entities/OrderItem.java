package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
	
	private Integer quantity;
	private Double price;
	
	private List<Product> product = new ArrayList<>();
	
	public OrderItem() {
		
	}

	public OrderItem(Integer quantity, Double price) {
		this.quantity = quantity;
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void addProduct (Product products) {
		product.add(products);
	}
	
	public void removeProduct(Product products) {
		product.remove(products);
	}
	
	public Double subTotal() {
		return quantity * price;
	}

	@Override
	public String toString() {
		return "OrderItem [quantity=" + quantity + ", price=" + price + ", product=" + getProduct() + "]";
	}
	
	
	
}
