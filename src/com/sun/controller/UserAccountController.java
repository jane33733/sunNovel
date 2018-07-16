package com.sun.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.sun.entity.SaveData;
import com.sun.entity.UserAccount;
import com.sun.service.SaveDataService;
import com.sun.service.UserAccountService;

@Controller
@RequestMapping(value = "userAccount")
public class UserAccountController {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserAccountController.class);
	private Gson gson = new Gson();

	@Autowired
	private UserAccountService userAccountService;
	
	@ResponseBody
    @RequestMapping(value = "registerNewUser", method = RequestMethod.POST)
    public String registerNewUser(@RequestBody UserAccount userAccount) throws Exception {
        // LOGGER.debug("[getByPrice]------ Start "+queryVO.getPriceBottom());
//        System.out.println("[getByPrice]------ Start "+queryVO.getPriceBottom());
        return userAccountService.registerNewUser(userAccount);
    }
    
//    @ResponseBody
//    @RequestMapping(value = "loadGame", method = RequestMethod.GET)
//    public List<SavePoint> loadGame(String name){
//        LOGGER.debug("[loadGame]------ Start ");
//        List<SavePoint> savePointList = null;
//        try {
//        	savePointList = savePointService.loadGame(name);
//        	LOGGER.info(gson.toJson(savePointList));
//		} catch (Exception e) {
//			LOGGER.error("[loadGame]{}",e);
//		}
//        return savePointList;
//    }
	
}
