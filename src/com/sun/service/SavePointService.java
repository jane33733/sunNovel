package com.sun.service;

import java.util.List;

import com.sun.entity.SavePoint;

public interface SavePointService {
	
	List<SavePoint> loadGame (String name);

}
