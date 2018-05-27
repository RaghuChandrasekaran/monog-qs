package com.github.raghuchandrasekaran.dao;

import java.util.List;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;

public interface DAO<T> {

	public MongoCollection<T> getCollection();

	public void addObjects(List<T> objs);

	public void deleteAll();

	public FindIterable<T> find();
}
