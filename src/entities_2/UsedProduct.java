package entities_2;

import java.time.LocalDateTime;


public class UsedProduct extends Product {
	
	private LocalDateTime manufactureDate;
		
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, LocalDateTime manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public LocalDateTime getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDateTime manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	
	@Override
	public String priceTag() {
		return name + " (used) $ " + price + " (Manufacture date: " + manufactureDate + ")";
	}
	
}
