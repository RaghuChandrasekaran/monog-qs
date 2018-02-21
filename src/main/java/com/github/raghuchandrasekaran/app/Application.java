package com.github.raghuchandrasekaran.app;

import java.util.Arrays;

import org.bson.Document;

import com.github.raghuchandrasekaran.dao.DAO;

public class Application {
	
	public static void main(String[] args) {
		DAO<Document> dao = new DocumentDaoImpl();
		Document doc = new Document();
		doc.put("test", "test");
		dao.addObjects(Arrays.asList(doc,new Document(doc),new Document(doc)));
		dao.deleteAll();
	}
}
