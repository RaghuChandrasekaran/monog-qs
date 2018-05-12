package com.github.raghuchandrasekaran.app;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bson.Document;
import org.springframework.stereotype.Repository;

import com.github.raghuchandrasekaran.dao.DAOImpl;

@Repository
public class DocumentDaoImpl extends DAOImpl<Document> {

	private static final Logger LOGGER = LogManager.getLogger(DocumentDaoImpl.class);

	public DocumentDaoImpl() {
		super("inventory", "items", Document.class);
	}

	@Override
	public void addObjects(List<Document> objs) {
		LOGGER.info("Adding objects {}", objs);
		super.addObjects(objs);
	}
}
