package com.sun.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.dao.SaveDataDao;
import com.sun.entity.SaveData;
import com.sun.service.SaveDataService;

@Service
public class SaveDataServiceImpl implements SaveDataService{

    private static final Logger LOGGER = LoggerFactory.getLogger(SaveDataServiceImpl.class);
    
    @Autowired
    private SaveDataDao saveDataDao = new SaveDataDao();
	
	
	@Override
	public List<SaveData> loadGame(String name) {
		System.out.println("enter service");
		LOGGER.info("start save data service");
		return saveDataDao.loadGame(name);
	}

	
	
}
