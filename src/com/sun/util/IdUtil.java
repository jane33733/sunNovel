package com.sun.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class IdUtil {
	
	public static String generatePeopleId(String simpleName) {
		// UA SD GP
		StringBuilder headStr = new StringBuilder(simpleName);
		headStr.append(addDateTime());
		headStr.append(addRandom());
		return headStr.toString();
	}
	
	private static String addDateTime() {
		LocalDateTime nowStamp = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
		return dtf.format(nowStamp);
	}
	
	public static String addRandom() {
		int range = (9999 - 1) + 1;
		range = (int) (Math.random() * range +1);
		return String.format("%04d", range);
	}

	
}
