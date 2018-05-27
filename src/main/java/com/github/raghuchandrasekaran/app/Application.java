package com.github.raghuchandrasekaran.app;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

import org.bson.Document;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.raghuchandrasekaran.dao.DAO;
import com.github.raghuchandrasekaran.model.BaseClass;
import com.github.raghuchandrasekaran.model.ChildClass;
import com.mongodb.Block;
import com.mongodb.client.FindIterable;

public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		Map<String, DAO> beanMap = ctx.getBeansOfType(DAO.class);
		DAO<Document> dao = DocumentDaoImpl.class.cast(beanMap.get("doc"));
		Document doc = new Document();
		doc.put("test", "test");
		dao.addObjects(Arrays.asList(doc, new Document(doc), new Document(doc)));

		DAO<BaseClass> baseClassDao = BaseClassDaoImpl.class.cast(beanMap.get("base"));
		BaseClass base = new ChildClass("child", "base");
		baseClassDao.addObjects(Collections.singletonList(base));

		FindIterable<BaseClass> items = baseClassDao.find();
		items.forEach((Block<BaseClass>) item -> System.out.println(item.toString()));
		ctx.close();
	}
}
