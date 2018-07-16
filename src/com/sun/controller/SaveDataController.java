package com.sun.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.sun.entity.SaveData;
import com.sun.service.SaveDataService;

@Controller
@RequestMapping(value = "saveData")
public class SaveDataController {

	private static final Logger LOGGER = LoggerFactory.getLogger(SaveDataController.class);
	private Gson gson = new Gson();

	@Autowired
	private SaveDataService saveDataService;
	
//	@ResponseBody
//    @RequestMapping(value = "getByPrice", method = RequestMethod.POST)
//    public List<UserAccount> getByPrice(@RequestBody ProductQueryVO queryVO) throws Exception {
//        // LOGGER.debug("[getByPrice]------ Start "+queryVO.getPriceBottom());
////        System.out.println("[getByPrice]------ Start "+queryVO.getPriceBottom());
//        return productService.searchByCondition(queryVO);
//    }
    
    @ResponseBody
    @RequestMapping(value = "loadGame", method = RequestMethod.GET)
    public List<SaveData> loadGame(String name){
        LOGGER.debug("[loadGame]------ Start ");
        List<SaveData> savePointList = null;
        try {
        	savePointList = saveDataService.loadGame(name);
        	LOGGER.info(gson.toJson(savePointList));
		} catch (Exception e) {
			LOGGER.error("[loadGame]{}",e);
		}
        return savePointList;
    }
	
}
