package com.sun.service.impl;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.dao.UserAccountDao;
import com.sun.entity.UserAccount;
import com.sun.service.UserAccountService;
import com.sun.util.IdUtil;

@Service
public class UserAccountServiceImpl implements UserAccountService{

    private static final Logger LOGGER = LoggerFactory.getLogger(UserAccountServiceImpl.class);
    
    @Autowired
    private UserAccountDao userAccountDao;

	@Override
	public String registerNewUser(UserAccount userAccount) {
		// TODO Auto-generated method stub
		LOGGER.info("[registerNewUser] --- start ---");
		userAccount.setId(IdUtil.generatePeopleId("UA"));
		userAccount.setUpdateTime(new Date());
		return null;
	}

	
	
}
