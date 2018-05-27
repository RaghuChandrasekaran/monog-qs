package com.github.raghuchandrasekaran.app;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.github.raghuchandrasekaran.dao.DAOImpl;
import com.github.raghuchandrasekaran.model.BaseClass;

@Repository("base")
public class BaseClassDaoImpl extends DAOImpl<BaseClass> {

	private static final Logger LOGGER = LogManager.getLogger(BaseClassDaoImpl.class);

	public BaseClassDaoImpl() {
		super("baseclass", "items", BaseClass.class);
	}

	@Override
	public void addObjects(List<BaseClass> objs) {
		LOGGER.info("Adding objects {}", objs);
		super.addObjects(objs);
	}
}
