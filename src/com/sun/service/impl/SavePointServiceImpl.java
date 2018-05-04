package com.sun.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.dao.SavePointDao;
import com.sun.entity.SavePoint;
import com.sun.service.SavePointService;

@Service
public class SavePointServiceImpl implements SavePointService{

    private static final Logger LOGGER = LoggerFactory.getLogger(SavePointServiceImpl.class);
    
    @Autowired
    private SavePointDao savePointDao = new SavePointDao();
	
	
	@Override
	public List<SavePoint> loadGame(String name) {
		System.out.println("enter service");
		LOGGER.info("start save point service");
		return savePointDao.loadGame(name);
	}

	
	
}
