package com.sun.service;

import java.util.List;

import com.sun.entity.SaveData;

public interface SaveDataService {
	
	List<SaveData> loadGame (String name);

}
