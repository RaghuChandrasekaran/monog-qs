package com.github.raghuchandrasekaran.app;

import org.bson.Document;

import com.github.raghuchandrasekaran.dao.DAOImpl;

public class DocumentDaoImpl extends DAOImpl<Document> {

	public DocumentDaoImpl() {
		super("inventory", "items", Document.class);
	}
}
