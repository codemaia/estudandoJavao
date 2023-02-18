package entities;

public class _Product {

	//EMCAPSULAMENTO
	private String name;
	private double price;
	private int quantity;
	
	// SOBRECARGA
	//CRIANDO CONSTRUCTOR (PADRAO)
	public _Product() {
		
	}
	
	//CRIANDO CONSTRUCTOR (PERSONALIZADO) - PODEMOS GERAR AUTOMATICAMENTE 
	//COM O BOTAO DIREITO > SOURCE > GENERATE CONSTRUCTORS USING FIELDS 
	public _Product (String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	//CRIANDO CONSTRUTOR PERSONALIZADO - SOBRECARGA
	public _Product (String name, double price) {
		this.name = name;
		this.price = price;
		//por padrão o java ja cria variaveis double e int iniciando com 0;
	}
	
	
	
	//ENCAPSULAMENTO - PODEMOS GERAR AUTOMETICAMENTE 
	//COM O BOTÃO DIREITO > SOURCE > GENERATE GETTERS AND SETTERS
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price; 
	}
	
	public int getQuantity() {
		return quantity;
	}
	// FIM ENCAPSULAMENTO
	
	
	
	
	public double totalValueInStock () {
		return price * quantity;
		
	}
	
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
		
	}
	
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	
	public String toString() {
		return name
			+ ", $ "
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f", totalValueInStock());
	}
	 
}
