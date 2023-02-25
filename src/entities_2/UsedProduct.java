package entities_2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

public class UsedProduct extends Product {
	
	private LocalDateTime manufactureDate;
	
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
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
		return name + " (used) $ " + price + " (Manufacture date: )" + manufactureDate;
	}
	
}
