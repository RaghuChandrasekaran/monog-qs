package com.github.raghuchandrasekaran.dao;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;

public class DatabaseManager {

	private DatabaseManager() {
	}

	public static MongoClient getMongoClient() {
		MongoClientOptions options = MongoClientOptions.builder().sslEnabled(false).build();
		return new MongoClient("localhost", options);
	}

}
