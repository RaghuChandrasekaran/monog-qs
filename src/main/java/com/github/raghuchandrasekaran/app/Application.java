package com.github.raghuchandrasekaran.app;

import java.util.Arrays;

import org.bson.Document;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.raghuchandrasekaran.dao.DAO;

public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		DAO<Document> dao = DocumentDaoImpl.class.cast(ctx.getBean(DAO.class));
		Document doc = new Document();
		doc.put("test", "test");
		dao.addObjects(Arrays.asList(doc, new Document(doc), new Document(doc)));
		ctx.close();
	}
}
