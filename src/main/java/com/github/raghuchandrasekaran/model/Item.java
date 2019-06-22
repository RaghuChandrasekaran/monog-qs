package com.github.raghuchandrasekaran.model;

public class Item {

	private String itemName;

	private String price;

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", price=" + price + "]";
	}

}
