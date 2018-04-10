package model;

public class Product {
	private String name;
	private Integer amount;
	private Float price;
	private Float totalPrice;
	
	public Product(String name, Integer amount, Float price) {
		this.name = name;
		this.amount = amount;
		this.price = price;
		this.totalPrice = amount * price;
	}
	
	public String toString() {
		return "Nome: " + name + "; Quant.: " + amount + "; Preço: "
				+ price + "; Valor Total: " + totalPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
		this.totalPrice = amount*price;
	}

	public Float getTotalPrice() {
		return totalPrice;
	}
	
}
