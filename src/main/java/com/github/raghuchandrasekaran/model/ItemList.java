package com.github.raghuchandrasekaran.model;

import java.util.List;

import org.bson.types.ObjectId;

public class ItemList {

	private ObjectId id;

	private List<Item> items;

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "ItemList [id=" + id + ", items=" + items + "]";
	}

}
