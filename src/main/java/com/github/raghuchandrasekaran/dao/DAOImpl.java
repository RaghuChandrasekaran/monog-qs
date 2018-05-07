package com.github.raghuchandrasekaran.dao;

import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;

public abstract class DAOImpl<T> implements DAO<T> {

	private final String databaseName;

	private final String collectionName;

	private final Class<T> type;

	@Autowired
	private MongoClient mongoClient;

	public DAOImpl(String databaseName, String collectionName, Class<T> type) {
		this.databaseName = databaseName;
		this.collectionName = collectionName;
		this.type = type;
	}

	public MongoCollection<T> getCollection() {
		return mongoClient.getDatabase(databaseName).getCollection(collectionName, type);
	}

	public void addObjects(List<T> objs) {
		getCollection().insertMany(objs);
	}

	public void deleteAll() {
		getCollection().deleteMany(new Document());
	}

}
