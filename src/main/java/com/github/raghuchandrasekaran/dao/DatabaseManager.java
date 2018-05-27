package com.github.raghuchandrasekaran.dao;

import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;

public class DatabaseManager {

	private DatabaseManager() {
	}

	public static MongoClient getMongoClient() {
		CodecRegistry pojoCodecRegistry = CodecRegistries.fromRegistries(MongoClient.getDefaultCodecRegistry(),
				CodecRegistries.fromProviders(PojoCodecProvider.builder().automatic(true).build()));
		MongoClientOptions options = MongoClientOptions.builder().codecRegistry(pojoCodecRegistry).sslEnabled(false)
				.build();
		return new MongoClient("localhost", options);
	}

}
