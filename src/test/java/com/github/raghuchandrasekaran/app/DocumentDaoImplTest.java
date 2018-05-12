package com.github.raghuchandrasekaran.app;

import java.util.Arrays;

import org.bson.Document;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mongodb.Block;
import com.mongodb.client.FindIterable;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:testApplicationContext.xml" })
public class DocumentDaoImplTest {

	@Autowired
	DocumentDaoImpl dao;

	@Test
	public void testAddition() {
		Document doc = new Document();
		doc.put("test", "test");
		dao.addObjects(Arrays.asList(doc, new Document(doc), new Document(doc)));
		dao.deleteAll();
	}

	@Test
	public void testFinding() {
		Document doc = new Document();
		doc.put("test", "test");
		dao.addObjects(Arrays.asList(doc, new Document(doc), new Document(doc)));
		FindIterable<Document> docs = dao.find();
		Assert.assertNotNull(docs);
		docs.forEach((Block<Document>) document -> Assert.assertEquals("test", doc.get("test")));
	}

}
