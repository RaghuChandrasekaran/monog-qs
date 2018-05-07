package com.github.raghuchandrasekaran.app;

import org.bson.Document;
import org.springframework.stereotype.Repository;

import com.github.raghuchandrasekaran.dao.DAOImpl;

@Repository
public class DocumentDaoImpl extends DAOImpl<Document> {

	public DocumentDaoImpl() {
		super("inventory", "items", Document.class);
	}
}
