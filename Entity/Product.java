package com.Entity;

public class Product
{
	@Override
	public String toString() {
		return "Product [id=" + id + ", Productname=" + Productname + ", Price=" + Price + ", Quantity=" + Quantity
				+ "]";
	}

	int id;
	String Productname;
	double Price;
	int Quantity;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductname() {
		return Productname;
	}

	public void setProductname(String productname) {
		Productname = productname;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public Product(int id, String productname, double price, int quantity) {
		super();
		this.id = id;
		Productname = productname;
		Price = price;
		Quantity = quantity;
	}
	
}
